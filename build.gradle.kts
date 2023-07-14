// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Plugins.AGP.application) version Versions.AGP apply false
    id (Plugins.AGP.library) version Versions.AGP apply false
    kotlin (Plugins.Kotlin.android) version Versions.kotlin apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.20" apply false
}