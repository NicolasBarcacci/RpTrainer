package fr.meteordesign.data.words

import fr.meteordesign.domain.external.models.Word
import fr.meteordesign.domain.external.repositories.WordsRepository
import javax.inject.Inject

internal class WordsRepositoryImpl @Inject constructor() : WordsRepository {
    override fun getWordList(): List<Word> =
        listOf(
            Word(
                writing = "dictionary",
            )
        )
}
