import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal class RpHiltPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply("kotlin-kapt")
            plugins.apply("com.google.dagger.hilt.android")

            dependencies {
                implementation(libs.library("hilt-android"))
                kapt(libs.library("hilt-android-compiler"))
            }
        }
    }
}
