package fr.meteordesign.domain.external.repositories

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.DictionaryModel

interface DictionaryRepository {
    fun getDictionary(): Result<DictionaryModel, Unit>
}
