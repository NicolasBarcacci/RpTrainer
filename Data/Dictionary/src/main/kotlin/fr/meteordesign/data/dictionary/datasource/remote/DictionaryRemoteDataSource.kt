package fr.meteordesign.data.dictionary.datasource.remote

import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.DictionaryModel

internal interface DictionaryRemoteDataSource {

    fun getDictionary(): Result<DictionaryModel, Unit>
}
