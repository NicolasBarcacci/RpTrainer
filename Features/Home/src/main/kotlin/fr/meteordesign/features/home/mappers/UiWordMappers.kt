package fr.meteordesign.features.home.mappers

import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordOfTheDayUiModel

internal fun Result<WordModel, Unit>.toUiWord(): WordOfTheDayUiModel? =
    when (this) {
        is Result.Failure -> null
        is Result.Success -> this.data.toWordUiModel()
    }

private fun WordModel.toWordUiModel(): WordOfTheDayUiModel =
    WordOfTheDayUiModel(
        writing = this.writing,
        ipaWriting = this.ipaWriting.toPhoneticTranscriptionUiModel()
    )

private fun IpaWritingModel.toPhoneticTranscriptionUiModel(): IpaWritingUiModel =
    when (this) {
        is IpaWritingModel.Strong -> {
            IpaWritingUiModel.Strong(
                strongForm = this.strongForm,
            )
        }

        is IpaWritingModel.StrongWeak -> {
            IpaWritingUiModel.StrongWeak(
                strongForm = this.strongForm,
                weakFormList = this.weakFormList,
            )
        }
    }
