package fr.meteordesign.data.dictionary.datasource.remote.mappers

import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteRepoModel
import fr.meteordesign.data.dictionary.datasource.remote.models.IpaWritingRemoteRepoModel
import fr.meteordesign.data.dictionary.datasource.remote.models.WordLocalRemoteModel
import fr.meteordesign.domain.models.dictionary.DictionaryModel
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordModel

internal fun DictionaryRemoteRepoModel.toDictionaryModel(): DictionaryModel =
    DictionaryModel(
        this.wordList.map { it.toWordModel() },
    )

private fun WordLocalRemoteModel.toWordModel(): WordModel =
    WordModel(
        writing = this.writing,
        ipaWriting = this.ipaWriting.toPhoneticTranscriptionModel(),
    )

private fun IpaWritingRemoteRepoModel.toPhoneticTranscriptionModel(): IpaWritingModel =
    if (this.weakFormList == null) {
        IpaWritingModel.Strong(
            strongForm = this.strongForm,
        )
    } else {
        IpaWritingModel.StrongWeak(
            strongForm = this.strongForm,
            weakFormList = this.weakFormList,
        )
    }
