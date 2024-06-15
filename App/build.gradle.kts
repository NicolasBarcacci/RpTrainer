plugins {
    id("RpApplication")
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
    implementation(project(":Features:Home"))
    // Data
    implementation(project(":Data:Core"))
    implementation(project(":Data:Dictionary"))
    // Domain
    implementation(project(":Domain"))
    // Libraries
    implementation(project(":Libraries:Logger"))
    // Ui
    implementation(project(":Ui"))
    // Misc
    implementation(project(":Pratik"))

    implementation(libs.androidx.activity.compose)
}
