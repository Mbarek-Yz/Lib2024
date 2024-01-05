package com.yazan.lib2024

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform