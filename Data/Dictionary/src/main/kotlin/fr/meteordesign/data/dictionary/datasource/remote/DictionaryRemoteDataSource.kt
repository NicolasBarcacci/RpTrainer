package fr.meteordesign.data.dictionary.datasource.remote

import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteModel
import fr.meteordesign.domain.common.Result

internal interface DictionaryRemoteDataSource {

    suspend fun getDictionary(): Result<DictionaryRemoteModel, Unit>
}
