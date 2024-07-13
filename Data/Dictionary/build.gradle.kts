plugins {
    id("RptAndroidLibrary")
    id("RptData")
}

android {
    namespace = "fr.meteordesign.data.dictionary"
}

dependencies {
    implementation(projects.data.core)
    implementation(projects.domain)
    implementation(projects.libraries.logger)
    implementation(projects.libraries.jsonParser)
}
