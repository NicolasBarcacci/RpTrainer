import com.android.build.api.dsl.CommonExtension
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal class RpComposePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            android {
                buildFeatures {
                    compose = true
                }

                composeOptions {
                    kotlinCompilerExtensionVersion = "1.5.1"
                }
            }

            dependencies {
                implementation(platform(libs.library("compose-bom")))
                implementation(libs.library("compose-material3"))
                implementation(libs.library("compose-uiToolingPreview"))
                debugImplementation(libs.library("compose-uiTooling"))
            }
        }
    }
}

private fun Project.android(action: CommonExtension<*, *, *, *, *, *>.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(CommonExtension::class.java)
            ?: throw GradleException("The module $name is not an Android plugin")
    )
