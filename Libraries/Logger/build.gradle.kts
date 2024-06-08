plugins {
    id("RpLibrary")
}

android {
    namespace = "fr.meteordesign.libraries.logger"

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.timber)
}
