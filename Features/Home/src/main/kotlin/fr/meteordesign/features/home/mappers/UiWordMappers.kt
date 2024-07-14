package fr.meteordesign.features.home.mappers

import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel.WordClass
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel.WordClass.IpaWriting
import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.IpaWritingModel
import fr.meteordesign.domain.models.dictionary.WordClassModel
import fr.meteordesign.domain.models.dictionary.WordModel

internal fun Result<WordModel, Unit>.toWordOfTheDayUiModel(): WordOfTheDayUiModel? =
    when (this) {
        is Result.Success -> this.data.toWordOfTheDayUiModel()
        is Result.Failure -> null
    }

private fun WordModel.toWordOfTheDayUiModel(): WordOfTheDayUiModel =
    WordOfTheDayUiModel(
        writing = RptString.Text(this.writing),
        wordClassList = this.wordClassList.map {
            it.toWordClass()
        }
    )

private fun WordClassModel.toWordClass(): WordClass =
    WordClass(
        label = this.toRptString(),
        ipaWriting = this.ipaWriting.toIpaWriting(),
    )

private fun WordClassModel.toRptString(): RptString =
    RptString.Android(
        when (this) {
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
    )

private fun IpaWritingModel.toIpaWriting(): IpaWriting =
    when (this) {
        is IpaWritingModel.Strong -> {
            IpaWriting.Strong(
                strongForm = RptString.Text(this.strongForm),
            )
        }

        is IpaWritingModel.WeakStrong -> {
            IpaWriting.WeakStrong(
                strongForm = RptString.Text(this.strongForm),
                weakFormList = this.weakFormList.map { RptString.Text(it) },
            )
        }
    }
