package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class WordRemoteModel(
    val writing: String,
    val wordClassList: List<WordClassRemoteModel>,
)
