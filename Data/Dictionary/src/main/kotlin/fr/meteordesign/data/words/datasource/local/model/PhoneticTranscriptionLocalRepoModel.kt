package fr.meteordesign.data.words.datasource.local.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhoneticTranscriptionLocalRepoModel(
    val strong: List<String>,
    val weak: List<String>?,
)
