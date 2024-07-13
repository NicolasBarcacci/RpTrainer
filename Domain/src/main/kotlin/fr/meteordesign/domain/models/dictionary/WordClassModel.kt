package fr.meteordesign.domain.models.dictionary

sealed interface WordClassModel {

    val ipaWriting: IpaWritingModel

    data class Adjective(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Adverb(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Article(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Conjunction(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Determiner(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Interjection(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class ModalVerb(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Noun(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Numeral(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Preposition(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Pronoun(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Verb(override val ipaWriting: IpaWritingModel) : WordClassModel
    data class Undefined(override val ipaWriting: IpaWritingModel) : WordClassModel
}
