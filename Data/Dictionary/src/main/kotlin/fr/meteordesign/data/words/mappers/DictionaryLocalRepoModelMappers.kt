package fr.meteordesign.data.words.mappers

import fr.meteordesign.data.words.datasource.local.model.DictionaryLocalRepoModel
import fr.meteordesign.data.words.datasource.local.model.PhoneticTranscriptionLocalRepoModel
import fr.meteordesign.data.words.datasource.local.model.WordLocalRepoModel
import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.DictionaryModel
import fr.meteordesign.domain.external.models.PhoneticTranscriptionModel
import fr.meteordesign.domain.external.models.WordModel

internal fun Result<DictionaryLocalRepoModel, Unit>.toDictionaryModel(): Result<DictionaryModel, Unit> =
    when (this) {
        is Result.Failure -> this
        is Result.Success -> Result.Success(this.data.toDictionaryModel())
    }

private fun DictionaryLocalRepoModel.toDictionaryModel(): DictionaryModel =
    DictionaryModel(
        this.wordList.map { it.toWordModel() },
    )

private fun WordLocalRepoModel.toWordModel(): WordModel =
    WordModel(
        writing = this.writing,
        phoneticTranscription = this.phoneticTranscription.toPhoneticTranscriptionModel(),
    )

private fun PhoneticTranscriptionLocalRepoModel.toPhoneticTranscriptionModel(): PhoneticTranscriptionModel =
    if (this.weak == null) {
        PhoneticTranscriptionModel.Strong(
            strongIpaWordList = this.strong,
        )
    } else {
        PhoneticTranscriptionModel.StrongWeak(
            strongIpaWordList = this.strong,
            weakIpaWordList = this.weak,
        )
    }
