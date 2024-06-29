package fr.meteordesign.domain.models.dictionary

data class WordModel(
    val writing: String,
    val wordClassList: List<WordClassModel>,
)
