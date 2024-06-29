package fr.meteordesign.data.dictionary.datasource.remote.mappers

import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteRepoModel
import fr.meteordesign.data.dictionary.datasource.remote.models.IpaWritingRemoteRepoModel
import fr.meteordesign.data.dictionary.datasource.remote.models.WordClassRemoteModel
import fr.meteordesign.data.dictionary.datasource.remote.models.WordLocalRemoteModel
import fr.meteordesign.domain.models.dictionary.DictionaryModel
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordClassModel
import fr.meteordesign.domain.models.dictionary.WordModel

internal fun DictionaryRemoteRepoModel.toDictionaryModel(): DictionaryModel =
    DictionaryModel(
        this.wordList.map { it.toWordModel() },
    )

private fun WordLocalRemoteModel.toWordModel(): WordModel =
    WordModel(
        writing = this.writing,
        wordClassList = this.wordClassList.map { it.toFormModel() },
    )

private fun WordClassRemoteModel.toFormModel(): WordClassModel {
    val ipaWriting = this.ipaWriting.toPhoneticTranscriptionModel()
    return when (type) {
        WordClassRemoteModel.Type.ADJECTIVE -> WordClassModel.Adjective(ipaWriting)
        WordClassRemoteModel.Type.ADVERB -> WordClassModel.Adverb(ipaWriting)
        WordClassRemoteModel.Type.ARTICLE -> WordClassModel.Article(ipaWriting)
        WordClassRemoteModel.Type.CONJUNCTION -> WordClassModel.Conjunction(ipaWriting)
        WordClassRemoteModel.Type.DETERMINER -> WordClassModel.Determiner(ipaWriting)
        WordClassRemoteModel.Type.INTERJECTION -> WordClassModel.Interjection(ipaWriting)
        WordClassRemoteModel.Type.MODAL_VERB -> WordClassModel.ModalVerb(ipaWriting)
        WordClassRemoteModel.Type.NOUN -> WordClassModel.Noun(ipaWriting)
        WordClassRemoteModel.Type.NUMERAL -> WordClassModel.Numeral(ipaWriting)
        WordClassRemoteModel.Type.PREPOSITION -> WordClassModel.Preposition(ipaWriting)
        WordClassRemoteModel.Type.PRONOUN -> WordClassModel.Pronoun(ipaWriting)
        WordClassRemoteModel.Type.VERB -> WordClassModel.Verb(ipaWriting)
        WordClassRemoteModel.Type.UNDEFINED -> WordClassModel.Undefined(ipaWriting)
    }
}

private fun IpaWritingRemoteRepoModel.toPhoneticTranscriptionModel(): IpaWritingModel =
    if (this.weakFormList == null) {
        IpaWritingModel.Strong(
            strongForm = this.strongForm,
        )
    } else {
        IpaWritingModel.WeakStrong(
            strongForm = this.strongForm,
            weakFormList = this.weakFormList,
        )
    }
