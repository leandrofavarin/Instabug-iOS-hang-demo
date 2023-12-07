package com.example.instabug.hang

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    init {
      MainScope().launch {
        delay(2000)
        error("Crashing the app...")
      }
    }

    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()