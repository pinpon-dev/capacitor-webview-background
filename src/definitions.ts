export interface BackgroundWebviewPlugin {
  updateBackgroundColor(options: { color: string }): Promise<{ color: string }>;
}
