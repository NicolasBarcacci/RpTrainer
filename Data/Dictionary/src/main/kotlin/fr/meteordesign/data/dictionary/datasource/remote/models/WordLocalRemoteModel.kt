package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class WordLocalRemoteModel(
    val writing: String,
    val wordClassList: List<WordClassRemoteModel>,
)
