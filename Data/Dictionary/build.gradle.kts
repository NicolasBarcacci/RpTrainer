plugins {
    id("RpLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.data.dictionary"
}

dependencies {
    implementation(project(":Domain"))
    implementation(project(":Data:Core"))
    implementation(project(":Pratik"))
    implementation(project(":Libraries:Logger"))
    implementation(project(":Libraries:JsonParser"))
}
