package fr.meteordesign.data.dictionary.datasource.remote.mappers

import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteModel
import fr.meteordesign.data.dictionary.datasource.remote.models.IpaWritingRemoteModel
import fr.meteordesign.data.dictionary.datasource.remote.models.WordClassRemoteModel
import fr.meteordesign.data.dictionary.datasource.remote.models.WordRemoteModel
import fr.meteordesign.domain.models.dictionary.DictionaryModel
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordClassModel
import fr.meteordesign.domain.models.dictionary.WordModel

internal fun DictionaryRemoteModel.toDictionaryModel(): DictionaryModel =
    DictionaryModel(
        this.wordList.map { it.toWordModel() },
    )

private fun WordRemoteModel.toWordModel(): WordModel =
    WordModel(
        writing = this.writing,
        wordClassList = this.wordClassList.map { it.toWordClassModel() },
    )

private fun WordClassRemoteModel.toWordClassModel(): WordClassModel {
    val ipaWriting = this.ipaWriting.toIpaWritingModel()
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

private fun IpaWritingRemoteModel.toIpaWritingModel(): IpaWritingModel =
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
