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
        create("RpAndroidApplication") {
            id = "RpAndroidApplication"
            implementationClass = "RpAndroidApplicationPlugin"
        }
    }

    plugins {
        create("RpAndroidLibrary") {
            id = "RpAndroidLibrary"
            implementationClass = "RpAndroidLibraryPlugin"
        }
    }

    plugins {
        create("RpKotlin") {
            id = "RpKotlin"
            implementationClass = "RpKotlinPlugin"
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
