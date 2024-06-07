import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.GradleException
import org.gradle.api.Project

class RpAndroidApplicationPlugin : RpAndroidBasePlugin("com.android.application") {
    override fun apply(target: Project) {
        super.apply(target)
        with(target) {

            android {

                defaultConfig {
                    targetSdk = 34
                }

                buildTypes {
                    debug {
                        isMinifyEnabled = false
                        isShrinkResources = false
                    }

                    release {
                        isMinifyEnabled = true
                        isShrinkResources = true
                    }
                }
            }
        }
    }
}

private fun Project.android(action: ApplicationExtension.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(ApplicationExtension::class.java)
            ?: throw GradleException("The module $name is not an Android application plugin")
    )
