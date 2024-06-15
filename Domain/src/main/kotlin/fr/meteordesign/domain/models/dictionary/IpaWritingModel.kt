package fr.meteordesign.domain.models.dictionary

sealed class IpaWritingModel(
    open val strongForm: String,
) {

    data class Strong(
        override val strongForm: String,
    ) : IpaWritingModel(strongForm)

    data class StrongWeak(
        override val strongForm: String,
        val weakFormList: List<String>,
    ) : IpaWritingModel(strongForm)
}
