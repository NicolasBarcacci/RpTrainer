enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        includeBuild("gradle")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RpTrainer"
include(":App")
include(":Features:Core")
include(":Features:Home")
include(":Features:IpaChart")
include(":Features:Learning")
include(":Features:Main")
include(":Data:Core")
include(":Data:Dictionary")
include(":Domain")
include(":DesignSystem")
include(":Libraries:Logger")
include(":Libraries:JsonParser")
