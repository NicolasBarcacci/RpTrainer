plugins {
    id("RpLibrary")
    id("RpHilt")
}

android {
    namespace = "fr.meteordesign.domain.internal"
}

dependencies {
    implementation(project(":Domain:External"))
}
