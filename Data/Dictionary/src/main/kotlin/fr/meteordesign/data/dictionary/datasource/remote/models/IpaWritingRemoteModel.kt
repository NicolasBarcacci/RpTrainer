package fr.meteordesign.data.dictionary.datasource.remote.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class IpaWritingRemoteModel(
    val strongForm: String,
    val weakFormList: List<String>?,
)
