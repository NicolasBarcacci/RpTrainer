plugins {
    id("RpLibrary")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.ui.organisms"
}

dependencies {
    implementation(project(":Ui:Atoms"))
    implementation(project(":Ui:Molecules"))
}
