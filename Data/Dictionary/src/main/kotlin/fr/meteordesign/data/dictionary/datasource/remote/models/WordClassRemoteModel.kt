package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class WordClassRemoteModel(
    val type: Type,
    val ipaWriting: IpaWritingRemoteRepoModel,
) {

    enum class Type {
        ADJECTIVE,
        ADVERB,
        ARTICLE,
        CONJUNCTION,
        DETERMINER,
        INTERJECTION,
        MODAL_VERB,
        NOUN,
        NUMERAL,
        PREPOSITION,
        PRONOUN,
        VERB,
        UNDEFINED,
    }
}
