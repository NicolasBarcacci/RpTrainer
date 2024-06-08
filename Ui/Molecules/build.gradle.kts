plugins {
    id("RpLibrary")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.ui.molecules"
}

dependencies {
    implementation(project(":Ui:Atoms"))
}
