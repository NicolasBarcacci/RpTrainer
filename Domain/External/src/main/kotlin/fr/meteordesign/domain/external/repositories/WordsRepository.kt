package fr.meteordesign.domain.external.repositories

import fr.meteordesign.domain.external.models.Word

interface WordsRepository {
    fun getWordList(): List<Word>
}
