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

    // Android Plugins

    plugins {
        create("RptAndroidApplication") {
            id = "RptAndroidApplication"
            implementationClass = "plugins.base.RptAndroidApplicationPlugin"
        }
    }

    plugins {
        create("RptAndroidLibrary") {
            id = "RptAndroidLibrary"
            implementationClass = "plugins.base.RptAndroidLibraryPlugin"
        }
    }

    plugins {
        create("RptKotlin") {
            id = "RptKotlin"
            implementationClass = "plugins.base.RptKotlinPlugin"
        }
    }

    // Scope Plugins

    plugins {
        create("RptApplication") {
            id = "RptApplication"
            implementationClass = "plugins.scope.RptApplicationPlugin"
        }
    }

    plugins {
        create("RptFeature") {
            id = "RptFeature"
            implementationClass = "plugins.scope.RptFeaturePlugin"
        }
    }

    plugins {
        create("RptData") {
            id = "RptData"
            implementationClass = "plugins.scope.RptDataPlugin"
        }
    }

    plugins {
        create("RptDomain") {
            id = "RptDomain"
            implementationClass = "plugins.scope.RptDomainPlugin"
        }
    }

    plugins {
        create("RptDesignSystem") {
            id = "RptDesignSystem"
            implementationClass = "plugins.scope.RptDesignSystemPlugin"
        }
    }

    plugins {
        create("RptLibrary") {
            id = "RptLibrary"
            implementationClass = "plugins.scope.RptLibraryPlugin"
        }
    }
}
