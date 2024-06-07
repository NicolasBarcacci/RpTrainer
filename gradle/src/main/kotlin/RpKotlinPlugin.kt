import org.gradle.api.GradleException
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension

internal class RpKotlinPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply("java-library")
            plugins.apply("org.jetbrains.kotlin.jvm")

            java {
                sourceCompatibility = JavaVersion.VERSION_17
                targetCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}

fun Project.java(action: JavaPluginExtension.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(JavaPluginExtension::class.java)
            ?: throw GradleException("The module $name is not a Java plugin")
    )
