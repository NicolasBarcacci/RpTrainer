package plugins.extensions

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.applyCompose() {
    android<CommonExtension<*, *, *, *, *, *>> {
        plugins.apply("org.jetbrains.kotlin.plugin.compose")

        buildFeatures {
            compose = true
        }
    }

    dependencies {
        implementation(platform(libs.library("compose-bom")))
        implementation(libs.library("compose-material3"))
        implementation(libs.library("compose-activity"))
        implementation(libs.library("compose-uiToolingPreview"))
        debugImplementation(libs.library("compose-uiTooling"))
    }
}

internal fun Project.applyComposeNavigation() {
    plugins.apply("org.jetbrains.kotlin.plugin.serialization")

    dependencies {
        implementation(libs.library("kotlinx-serialization-json"))
        implementation(libs.library("compose-navigation"))
        implementation(libs.library("compose-navigation-hilt"))
    }
}
