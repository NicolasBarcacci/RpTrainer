plugins {
    id("RpAndroidLibrary")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    implementation(projects.domain)
    implementation(projects.ui)
    implementation(projects.libraries.logger)
}
