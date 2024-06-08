package fr.meteordesign.features.home.mappers

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.PhoneticTranscriptionModel
import fr.meteordesign.domain.external.models.WordModel
import fr.meteordesign.pratik.extensions.capitalize
import fr.meteordesign.ui.organims.wordOfTheDay.models.PhoneticTranscriptionUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordOfTheDayUiModel

internal fun Result<WordModel, Unit>.toUiWord(): WordOfTheDayUiModel? =
    when (this) {
        is Result.Failure -> null
        is Result.Success -> this.data.toWordUiModel()
    }

private fun WordModel.toWordUiModel(): WordOfTheDayUiModel =
    WordOfTheDayUiModel(
        writing = this.writing
            .capitalize(),
        phoneticTranscription = this.phoneticTranscription.toPhoneticTranscriptionUiModel()
    )

private fun PhoneticTranscriptionModel.toPhoneticTranscriptionUiModel(): PhoneticTranscriptionUiModel =
    when (this) {
        is PhoneticTranscriptionModel.Strong -> {
            PhoneticTranscriptionUiModel.Strong(
                strongIpaWordList = this.strongIpaWordList,
            )
        }

        is PhoneticTranscriptionModel.StrongWeak -> {
            PhoneticTranscriptionUiModel.StrongWeak(
                strongIpaWordList = this.strongIpaWordList,
                weakIpaWordList = this.weakIpaWordList,
            )
        }
    }
