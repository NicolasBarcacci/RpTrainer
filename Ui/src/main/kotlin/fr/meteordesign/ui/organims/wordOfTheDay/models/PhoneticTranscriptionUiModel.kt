package fr.meteordesign.ui.organims.wordOfTheDay.models

sealed class PhoneticTranscriptionUiModel {

    data class Strong(
        val strongIpaWordList: List<String>,
    ) : PhoneticTranscriptionUiModel()

    data class StrongWeak(
        val strongIpaWordList: List<String>,
        val weakIpaWordList: List<String>,
    ) : PhoneticTranscriptionUiModel()
}
