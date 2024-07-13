plugins {
    id("RptAndroidLibrary")
    id("RptLibrary")
}

android {
    namespace = "fr.meteordesign.libraries.jsonParser"
}

dependencies {
    implementation(projects.libraries.logger)
    api(libs.moshi)
}
