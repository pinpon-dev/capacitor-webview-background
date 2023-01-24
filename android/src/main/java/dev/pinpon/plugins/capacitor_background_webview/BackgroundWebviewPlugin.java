package dev.pinpon.plugins.capacitor_background_webview;

import android.graphics.Color;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.plugin.WebView;

@CapacitorPlugin(name = "BackgroundWebview")
public class BackgroundWebviewPlugin extends Plugin {
    @PluginMethod
    public void updateBackgroundColor(PluginCall call) {
        String colorHex = call.getString("color", "#000000");
        int parsedColor = Color.parseColor(colorHex);
        var webView = this.bridge.getWebView();
        webView.setBackgroundColor(parsedColor);
        JSObject ret = new JSObject();
        ret.put("color", colorHex);
        call.resolve(ret);
    }
}
