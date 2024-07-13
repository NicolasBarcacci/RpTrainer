package fr.meteordesign.designSystem.organims.wordOfTheDay.models

data class WordOfTheDayUiModel(
    val writing: String,
    val wordClassList: List<WordClassUiModel>,
)
