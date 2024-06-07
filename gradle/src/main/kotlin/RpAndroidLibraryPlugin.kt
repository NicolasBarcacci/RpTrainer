import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.GradleException
import org.gradle.api.Project

class RpAndroidLibraryPlugin : RpAndroidBasePlugin("com.android.library") {
    override fun apply(target: Project) {
        super.apply(target)
        with(target) {

            android {

                defaultConfig {
                    consumerProguardFiles("consumer-rules.pro")
                }
            }
        }
    }
}

private fun Project.android(action: LibraryExtension.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(LibraryExtension::class.java)
            ?: throw GradleException("The module $name is not an Android library plugin")
    )
