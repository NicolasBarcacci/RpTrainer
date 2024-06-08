package fr.meteordesign.data.words

import fr.meteordesign.data.words.datasource.local.DictionaryLocalDataSource
import fr.meteordesign.data.words.mappers.toDictionaryModel
import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.DictionaryModel
import fr.meteordesign.domain.external.repositories.DictionaryRepository
import javax.inject.Inject

internal class DictionaryRepositoryImpl @Inject constructor(
    private val dictionaryLocalDataSource: DictionaryLocalDataSource,
) : DictionaryRepository {
    override fun getDictionary(): Result<DictionaryModel, Unit> =
        dictionaryLocalDataSource.getDictionary()
            .toDictionaryModel()
}
