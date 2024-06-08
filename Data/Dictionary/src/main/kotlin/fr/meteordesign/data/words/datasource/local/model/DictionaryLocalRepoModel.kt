package fr.meteordesign.data.words.datasource.local.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class DictionaryLocalRepoModel(
    val wordList: List<WordLocalRepoModel>
)
