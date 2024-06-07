package fr.meteordesign.features.home

internal data class HomeUiState(
    val wordOfTheDay: UiWord?,
)

data class UiWord(
    val writing: String,
)