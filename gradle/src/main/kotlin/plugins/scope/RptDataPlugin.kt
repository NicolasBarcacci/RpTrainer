package plugins.scope

import org.gradle.api.Plugin
import org.gradle.api.Project
import plugins.extensions.applyAndroidHilt

internal abstract class RptDataPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyAndroidHilt()
        }
    }
}
