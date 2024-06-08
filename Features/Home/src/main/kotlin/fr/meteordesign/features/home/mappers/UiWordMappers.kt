package fr.meteordesign.features.home.mappers

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.PhoneticTranscriptionModel
import fr.meteordesign.domain.external.models.WordModel
import fr.meteordesign.features.home.models.PhoneticTranscriptionUiModel
import fr.meteordesign.features.home.models.WordUiModel
import fr.meteordesign.pratik.extensions.capitalize

internal fun Result<WordModel, Unit>.toUiWord(): WordUiModel? =
    when (this) {
        is Result.Failure -> null
        is Result.Success -> this.data.toWordUiModel()
    }

private fun WordModel.toWordUiModel(): WordUiModel =
    WordUiModel(
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
