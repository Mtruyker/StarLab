package com.truyk.starlab

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform