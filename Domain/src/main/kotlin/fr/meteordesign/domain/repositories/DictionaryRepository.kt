package fr.meteordesign.domain.repositories

import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.DictionaryModel

interface DictionaryRepository {
    suspend fun getDictionary(): Result<DictionaryModel, Unit>
}
