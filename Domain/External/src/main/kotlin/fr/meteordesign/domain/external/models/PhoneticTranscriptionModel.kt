package fr.meteordesign.domain.external.models

sealed class PhoneticTranscriptionModel {

    data class Strong(
        val strongIpaWordList: List<String>,
    ) : PhoneticTranscriptionModel()

    data class StrongWeak(
        val strongIpaWordList: List<String>,
        val weakIpaWordList: List<String>,
    ) : PhoneticTranscriptionModel()
}
