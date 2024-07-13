package plugins.scope

import org.gradle.api.Plugin
import org.gradle.api.Project
import plugins.extensions.applyCompose

internal class RptDesignSystemPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyCompose()
        }
    }
}
