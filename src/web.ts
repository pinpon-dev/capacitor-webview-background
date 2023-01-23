import { WebPlugin } from '@capacitor/core';

import type { BackgroundWebviewPlugin } from './definitions';

export class BackgroundWebviewWeb extends WebPlugin implements BackgroundWebviewPlugin {
  async updateBackgroundColor(options: { color: string }): Promise<{ color: string }> {
    console.log('Color for WebView', options);
    return options;
  }
}
