plugins {
    id("RptAndroidLibrary")
    id("RptFeature")
}

android {
    namespace = "fr.meteordesign.features.main"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.designSystem)
    implementation(projects.libraries.logger)
}
