package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class DictionaryRemoteModel(
    val wordList: List<WordRemoteModel>,
)
