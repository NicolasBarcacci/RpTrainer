package fr.meteordesign.domain.models.dictionary

sealed class WordClassModel(
    open val ipaWriting: IpaWritingModel,
) {
    data class Adjective(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Adverb(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Article(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Conjunction(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Determiner(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Interjection(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class ModalVerb(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Noun(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Numeral(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Preposition(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Pronoun(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Verb(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
    data class Undefined(override val ipaWriting: IpaWritingModel) : WordClassModel(ipaWriting)
}
