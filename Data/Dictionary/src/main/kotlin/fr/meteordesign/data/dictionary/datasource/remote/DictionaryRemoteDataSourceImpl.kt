package fr.meteordesign.data.dictionary.datasource.remote

import fr.meteordesign.data.dictionary.R
import fr.meteordesign.data.dictionary.datasource.remote.models.DictionaryRemoteModel
import fr.meteordesign.domain.common.Result
import fr.meteordesign.jsonparser.JsonParser
import fr.meteordesign.data.core.tools.RawFileReader
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

/**
 * TODO find a API to get data from
 */
internal class DictionaryRemoteDataSourceImpl(
    private val dispatcher: CoroutineDispatcher,
    private val rawFileReader: RawFileReader,
    private val jsonParser: JsonParser,
) : DictionaryRemoteDataSource {

    override suspend fun getDictionary(): Result<DictionaryRemoteModel, Unit> =
        jsonParser.fromJson<DictionaryRemoteModel>(
            withContext(dispatcher) {
                rawFileReader.read(R.raw.dictionary)
            }
        )?.let {
            Result.Success(it)
        } ?: Result.Failure(Unit)
}
