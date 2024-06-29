package fr.meteordesign.features.home.mappers

import androidx.annotation.StringRes
import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordClassModel
import fr.meteordesign.domain.models.dictionary.WordModel
import fr.meteordesign.ui.R
import fr.meteordesign.ui.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordClassUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordOfTheDayUiModel

internal fun Result<WordModel, Unit>.toUiWord(): WordOfTheDayUiModel? =
    when (this) {
        is Result.Failure -> null
        is Result.Success -> this.data.toWordUiModel()
    }

private fun WordModel.toWordUiModel(): WordOfTheDayUiModel =
    WordOfTheDayUiModel(
        writing = this.writing,
        wordClassList = this.wordClassList.map {
            it.toWordClassUiModel()
        }
    )

private fun WordClassModel.toWordClassUiModel(): WordClassUiModel =
    WordClassUiModel(
        labelResId = this.toStringResId(),
        ipaWriting = this.ipaWriting.toIpaWritingUiModel(),
    )

private fun WordClassModel.toStringResId(): Int =
    when(this) {
        is WordClassModel.Adjective -> R.string.word_type_adjective
        is WordClassModel.Adverb -> R.string.word_type_adverb
        is WordClassModel.Article -> R.string.word_type_article
        is WordClassModel.Conjunction -> R.string.word_type_conjunction
        is WordClassModel.Determiner -> R.string.word_type_determiner
        is WordClassModel.Interjection -> R.string.word_type_interjection
        is WordClassModel.ModalVerb -> R.string.word_type_modalVerb
        is WordClassModel.Noun -> R.string.word_type_noun
        is WordClassModel.Numeral -> R.string.word_type_numeral
        is WordClassModel.Preposition -> R.string.word_type_preposition
        is WordClassModel.Pronoun -> R.string.word_type_pronoun
        is WordClassModel.Verb -> R.string.word_type_verb
        is WordClassModel.Undefined -> R.string.word_type_undefined
    }

private fun IpaWritingModel.toIpaWritingUiModel(): IpaWritingUiModel =
    when (this) {
        is IpaWritingModel.Strong -> {
            IpaWritingUiModel.Strong(
                strongForm = this.strongForm,
            )
        }

        is IpaWritingModel.WeakStrong -> {
            IpaWritingUiModel.WeakStrong(
                strongForm = this.strongForm,
                weakFormList = this.weakFormList,
            )
        }
    }
