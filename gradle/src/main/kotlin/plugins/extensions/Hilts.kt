package plugins.extensions

import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.applyAndroidHilt() {
    this.applyHilt()
    plugins.apply("com.google.dagger.hilt.android")

    dependencies {
        implementation(libs.library("hilt-android"))
    }
}

internal fun Project.applyKotlinHilt() {
    this.applyHilt()
    dependencies {
        implementation(libs.library("hilt-core"))
    }
}

private fun Project.applyHilt() {
    plugins.apply("com.google.devtools.ksp")
    dependencies {
        ksp(libs.library("hilt-android-compiler"))
    }
}
