package fr.meteordesign.ui.organims.wordOfTheDay.models

sealed class IpaWritingUiModel(
    open val strongForm: String,
) {

    data class Strong(
        override val strongForm: String,
    ) : IpaWritingUiModel(strongForm)

    data class StrongWeak(
        override val strongForm: String,
        val weakFormList: List<String>,
    ) : IpaWritingUiModel(strongForm)
}
