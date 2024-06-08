plugins {
    id("RpLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.data.words"
}

dependencies {
    implementation(project(":Domain:External"))
    implementation(project(":Data:Core"))
    implementation(project(":Pratik"))
    implementation(libs.moshi)
}
