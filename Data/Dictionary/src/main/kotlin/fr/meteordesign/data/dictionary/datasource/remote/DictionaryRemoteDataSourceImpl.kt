package fr.meteordesign.data.dictionary.datasource.remote

import fr.meteordesign.data.dictionary.R
import fr.meteordesign.data.dictionary.datasource.remote.mappers.toDictionaryModel
import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteRepoModel
import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.models.dictionary.DictionaryModel
import fr.meteordesign.jsonparser.JsonParser
import fr.meteordesign.pratik.tools.RawFileReader
import javax.inject.Inject

/**
 * TODO find a API to get data from
 */
internal class DictionaryRemoteDataSourceImpl @Inject constructor(
    private val rawFileReader: RawFileReader,
    private val jsonParser: JsonParser,
) : DictionaryRemoteDataSource {

    override fun getDictionary(): Result<DictionaryModel, Unit> =
        jsonParser.fromJson<DictionaryRemoteRepoModel>(
            rawFileReader.read(R.raw.dictionary)
        )?.let {
            Result.Success(it
                .toDictionaryModel())
        } ?: Result.Failure(Unit)
}
