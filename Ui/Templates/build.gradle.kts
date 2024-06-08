plugins {
    id("RpLibrary")
    id("RpCompose")
}

android {
    namespace = "fr.meteordesign.ui.templates"
}
dependencies {
    implementation(project(":Ui:Atoms"))
    implementation(project(":Ui:Molecules"))
    implementation(project(":Ui:Organisms"))
}
