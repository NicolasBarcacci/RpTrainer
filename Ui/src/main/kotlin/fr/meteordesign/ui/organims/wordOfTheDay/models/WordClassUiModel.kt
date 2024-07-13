package fr.meteordesign.ui.organims.wordOfTheDay.models

import androidx.annotation.StringRes

data class WordClassUiModel(
    @StringRes val labelResId: Int,
    val ipaWriting: IpaWritingUiModel,
)
