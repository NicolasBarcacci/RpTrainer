import com.android.build.api.dsl.CommonExtension
import org.gradle.api.GradleException
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class RpAndroidBasePlugin(private val androidPluginId: String) : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            plugins.apply(androidPluginId)
            plugins.apply("kotlin-android")

            android {
                compileSdk = 34

                defaultConfig {
                    minSdk = 24
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        "proguard-rules.pro"
                    )
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }
    }
}

private fun Project.android(action: CommonExtension<*, *, *, *, *, *>.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(CommonExtension::class.java)
            ?: throw GradleException("The module $name is not an Android plugin")
    )
