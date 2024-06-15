package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class WordLocalRemoteModel(
    val id: Int,
    val writing: String,
    val ipaWriting: IpaWritingRemoteRepoModel,
)
