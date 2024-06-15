plugins {
    id("RpKotlin")
    id("kotlin-kapt")
}

dependencies {
    implementation(libs.hilt.core)
    kapt(libs.hilt.android.compiler)
}