plugins {
    id("RpLibrary")
    id("RpHilt")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.features.home"
}

dependencies {
    // Ui
    implementation(project(":Ui:Molecules"))
    implementation(project(":Ui:Organisms"))
    implementation(project(":Ui:Templates"))

    implementation(libs.hilt.navigationCompose)
}
