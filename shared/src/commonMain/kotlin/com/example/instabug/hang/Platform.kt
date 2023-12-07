package com.example.instabug.hang

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform