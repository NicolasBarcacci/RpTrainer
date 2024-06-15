plugins {
    id("RpLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.libraries.jsonParser"
}

dependencies {
    implementation(project(":Libraries:Logger"))
    api(libs.moshi)
}
