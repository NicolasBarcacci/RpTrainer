plugins {
    id("RpAndroidLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.libraries.jsonParser"
}

dependencies {
    implementation(projects.libraries.logger)
    api(libs.moshi)
}
