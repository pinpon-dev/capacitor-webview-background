package dev.pinpon.plugins.capacitor_background_webview;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "BackgroundWebview")
public class BackgroundWebviewPlugin extends Plugin {

    private BackgroundWebview implementation = new BackgroundWebview();

    @PluginMethod
    public void updateBackgroundColor(PluginCall call) {
        String colorHex = call.getString("color");

        JSObject ret = new JSObject();
        ret.put("color", implementation.echo(this.bridge.getWebView().setBackgroundColor(Color.parseColor(colorHex))));
        call.resolve(ret);
    }
}
