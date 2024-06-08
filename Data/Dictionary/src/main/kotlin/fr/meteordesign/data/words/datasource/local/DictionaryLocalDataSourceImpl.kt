package fr.meteordesign.data.words.datasource.local

import android.util.Log
import fr.meteordesign.data.words.R
import fr.meteordesign.data.words.datasource.local.model.DictionaryLocalRepoModel
import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.pratik.tools.JsonParser
import fr.meteordesign.pratik.tools.JsonParsingException
import fr.meteordesign.pratik.tools.RawFileReader
import javax.inject.Inject

internal class DictionaryLocalDataSourceImpl @Inject constructor(
    private val rawFileReader: RawFileReader,
    private val jsonParser: JsonParser,
) : DictionaryLocalDataSource {

    override fun getDictionary(): Result<DictionaryLocalRepoModel, Unit> =
        try {
            val json = rawFileReader.read(R.raw.dictionary)
            Log.d("MYTAG", "json=$json")
            val dictionaryLocalRepoModel: DictionaryLocalRepoModel = jsonParser.toObject(json)
            Log.d("MYTAG", "dictionaryLocalRepoModel=$dictionaryLocalRepoModel")
            Result.Success(
                dictionaryLocalRepoModel,
            )
        } catch (e: JsonParsingException) {
            Log.e(this::class.simpleName, e.cause.toString())
            Result.Failure(Unit)
        }
}
