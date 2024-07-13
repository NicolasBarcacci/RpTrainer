package fr.meteordesign.designSystem.organims.wordOfTheDay.models

import androidx.annotation.StringRes

data class WordClassUiModel(
    @StringRes val labelResId: Int,
    val ipaWriting: IpaWritingUiModel,
)
