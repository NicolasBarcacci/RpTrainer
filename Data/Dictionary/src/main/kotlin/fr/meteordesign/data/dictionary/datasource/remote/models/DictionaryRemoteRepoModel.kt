package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class DictionaryRemoteRepoModel(
    val wordList: List<WordLocalRemoteModel>,
)
