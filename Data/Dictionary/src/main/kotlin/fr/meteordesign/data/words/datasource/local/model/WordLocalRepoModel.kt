package fr.meteordesign.data.words.datasource.local.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WordLocalRepoModel(
    val writing: String,
    val phoneticTranscription: PhoneticTranscriptionLocalRepoModel,
)
