package plugins.extensions

import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.provider.Provider
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal inline fun <reified Extension> Project.android(action: Extension.() -> Unit): Unit =
    action.invoke(
        project.extensions.findByType(Extension::class.java)
            ?: throw GradleException("The module $name is not an Android library plugin")
    )

/**
 * @see https://kotlinlang.org/docs/gradle.html#compiler-options
 */
internal fun Project.kotlinOptions(action: KotlinJvmOptions.() -> Unit): Unit =
    this.tasks.withType(KotlinCompile::class.java).configureEach {
        kotlinOptions {
            action.invoke(this)
        }
    }

internal fun DependencyHandler.implementation(dependencyNotation: Any) {
    add("implementation", dependencyNotation)
}

internal fun DependencyHandler.debugImplementation(dependencyNotation: Any) {
    add("debugImplementation", dependencyNotation)
}

internal fun DependencyHandler.ksp(dependencyNotation: Any) {
    add("ksp", dependencyNotation)
}

internal val Project.libs: VersionCatalog
    get() = this.extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

internal fun VersionCatalog.library(alias: String): Provider<MinimalExternalModuleDependency> =
    this.findLibrary(alias).get()

internal fun VersionCatalog.version(alias: String): String =
    this.findVersion(alias).get().toString()
