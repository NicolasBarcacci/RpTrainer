package plugins.base

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.Project
import plugins.extensions.android

internal class RptAndroidLibraryPlugin : RptAndroidBasePlugin("com.android.library") {

    override fun apply(target: Project) {
        super.apply(target)
        with(target) {
            android<LibraryExtension> {
                defaultConfig {
                    consumerProguardFiles("consumer-rules.pro")
                }
            }
        }
    }
}
