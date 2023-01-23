import { registerPlugin } from '@capacitor/core';

import type { BackgroundWebviewPlugin } from './definitions';

const BackgroundWebview = registerPlugin<BackgroundWebviewPlugin>('BackgroundWebview', {
  web: () => import('./web').then(m => new m.BackgroundWebviewWeb()),
});

export * from './definitions';
export { BackgroundWebview };
