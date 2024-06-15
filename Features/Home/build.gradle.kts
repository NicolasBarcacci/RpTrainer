plugins {
    id("RpLibrary")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    implementation(project(":Domain"))
    implementation(project(":Ui"))
    implementation(project(":Pratik"))
    implementation(project(":Libraries:Logger"))

    implementation(libs.androidx.hilt.compose)
}
