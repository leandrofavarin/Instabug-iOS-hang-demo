import SwiftUI
import Instabug

@main
struct iOSApp: App {
  init() {
    Instabug.start(withToken: "any value hangs the app, empty correctly crashes", invocationEvents: .shake)
  }

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
