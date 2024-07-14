plugins {
    id("RptAndroidApplication")
    id("RptApplication")
}

android {
    namespace = "fr.meteordesign.rpt"

    defaultConfig {
        applicationId = "fr.meteordesign.rpt"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    // Features
    implementation(projects.features.core)
    implementation(projects.features.home)
    implementation(projects.features.learning)
    implementation(projects.features.main)
    // Data
    implementation(projects.data.core)
    implementation(projects.data.dictionary)
    // Domain
    implementation(projects.domain)
    // Design System
    implementation(projects.designSystem)
    // Libraries
    implementation(projects.libraries.logger)
}
