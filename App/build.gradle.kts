plugins {
    id("RpAndroidApplication")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.rpTrainer"

    defaultConfig {
        applicationId = "fr.meteordesign.rpTrainer"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    // Features
    implementation(projects.features.home)
    // Data
    implementation(projects.data.core)
    implementation(projects.data.dictionary)
    // Domain
    implementation(projects.domain)
    // Libraries
    implementation(projects.libraries.logger)
    // Ui
    implementation(projects.ui)

    implementation(libs.androidx.activity.compose)
}
