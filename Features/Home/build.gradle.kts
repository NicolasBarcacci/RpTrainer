plugins {
    id("RptAndroidLibrary")
    id("RptFeature")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    implementation(projects.features.core)
    implementation(projects.domain)
    implementation(projects.designSystem)
    implementation(projects.libraries.logger)
}
