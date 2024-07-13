package plugins.scope

import org.gradle.api.Plugin
import org.gradle.api.Project
import plugins.extensions.applyKotlinHilt

internal abstract class RptDomainPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyKotlinHilt()
        }
    }
}
