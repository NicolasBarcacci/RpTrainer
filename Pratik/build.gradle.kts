plugins {
    id("RpLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.pratik"
}

dependencies {
    implementation(libs.moshi)
}
