package fr.meteordesign.features.home.mappers

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.Word
import fr.meteordesign.features.home.UiWord
import fr.meteordesign.pratik.extensions.capitalize

internal fun Result<Word, Unit>.toUiWord(): UiWord? =
    when (this) {
        is Result.Failure -> null
        is Result.Success ->
            UiWord(
                writing = this.data.writing
                    .capitalize(),
            )
    }
