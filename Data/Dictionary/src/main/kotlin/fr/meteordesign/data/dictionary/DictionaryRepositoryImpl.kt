package fr.meteordesign.data.dictionary

import fr.meteordesign.data.dictionary.datasource.remote.DictionaryRemoteDataSource
import fr.meteordesign.data.dictionary.datasource.remote.mappers.toDictionaryModel
import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.common.mapSuccess
import fr.meteordesign.domain.models.dictionary.DictionaryModel
import fr.meteordesign.domain.repositories.DictionaryRepository
import javax.inject.Inject

internal class DictionaryRepositoryImpl @Inject constructor(
    private val dictionaryRemoteDataSource: DictionaryRemoteDataSource,
) : DictionaryRepository {

    override suspend fun getDictionary(): Result<DictionaryModel, Unit> {
        return dictionaryRemoteDataSource.getDictionary()
            .mapSuccess { Result.Success(it.toDictionaryModel()) }
    }
}
