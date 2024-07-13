package fr.meteordesign.data.dictionary._di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.data.dictionary.DictionaryRepositoryImpl
import fr.meteordesign.data.dictionary.datasource.remote.DictionaryRemoteDataSource
import fr.meteordesign.data.dictionary.datasource.remote.DictionaryRemoteDataSourceImpl
import fr.meteordesign.domain.repositories.DictionaryRepository
import fr.meteordesign.jsonparser.JsonParser
import fr.meteordesign.data.core.tools.RawFileReader
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
internal interface DictionaryModule {

    @Binds
    fun bindsDictionaryRepository(
        wordsRepositoryImpl: DictionaryRepositoryImpl,
    ): DictionaryRepository

    companion object {

        @Provides
        fun providesDictionaryRemoteDataSource(
            rawFileReader: RawFileReader,
            jsonParser: JsonParser,
        ): DictionaryRemoteDataSource =
            DictionaryRemoteDataSourceImpl(
                dispatcher = Dispatchers.IO,
                rawFileReader = rawFileReader,
                jsonParser = jsonParser,
            )
    }
}
