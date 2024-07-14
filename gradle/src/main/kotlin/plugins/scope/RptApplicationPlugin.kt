package plugins.scope

import org.gradle.api.Plugin
import org.gradle.api.Project
import plugins.extensions.applyAndroidHilt
import plugins.extensions.applyCompose
import plugins.extensions.applyComposeNavigation

internal abstract class RptApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyAndroidHilt()
            applyCompose()
            applyComposeNavigation()
        }
    }
}
