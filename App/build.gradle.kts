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
    implementation(libs.androidx.activity.compose)
}
