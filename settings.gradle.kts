pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StarLab"
include(":androidApp")
include(":shared")
include (":common:auth:api")
include (":common:auth:presentation")
include (":common:auth:data")
include (":common:news")
include (":common:news:api")
include (":common:news:presentation")
include (":common:news:data")
include (":common:analiz:api")
include (":common:analiz:presentation")
include (":common:analiz:data")
include (":common:core")
