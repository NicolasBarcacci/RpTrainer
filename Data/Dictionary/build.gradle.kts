plugins {
    id("RpAndroidLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.data.dictionary"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data.core)
    implementation(projects.libraries.logger)
    implementation(projects.libraries.jsonParser)
}
