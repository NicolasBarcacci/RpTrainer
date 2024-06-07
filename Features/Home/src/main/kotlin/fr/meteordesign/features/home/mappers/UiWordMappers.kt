package fr.meteordesign.features.home.mappers

import fr.meteordesign.domain.external.getWordOfTheDay.Word
import fr.meteordesign.features.home.UiWord

internal fun Word.toUiWord(): UiWord =
    UiWord(
        writing = this.writing,
    )
