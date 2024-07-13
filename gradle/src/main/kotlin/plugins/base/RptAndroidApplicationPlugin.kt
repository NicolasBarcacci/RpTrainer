package plugins.base

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Project
import plugins.extensions.android

internal class RptAndroidApplicationPlugin : RptAndroidBasePlugin("com.android.application") {

    override fun apply(target: Project) {
        super.apply(target)
        with(target) {
            android<ApplicationExtension> {
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
