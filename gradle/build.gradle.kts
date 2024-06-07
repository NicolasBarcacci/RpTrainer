plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

dependencies {
    implementation(libs.gradle.android)
    implementation(libs.gradle.kotlin)
}

gradlePlugin {
    plugins {
        create("RpApplication") {
            id = "RpApplication"
            implementationClass = "RpAndroidApplicationPlugin"
        }
    }

    plugins {
        create("RpLibrary") {
            id = "RpLibrary"
            implementationClass = "RpAndroidLibraryPlugin"
        }
    }

    plugins {
        create("RpCompose") {
            id = "RpCompose"
            implementationClass = "RpComposePlugin"
        }
    }

    plugins {
        create("RpHilt") {
            id = "RpHilt"
            implementationClass = "RpHiltPlugin"
        }
    }
}
