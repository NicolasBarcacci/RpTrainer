package fr.meteordesign.data.dictionary._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.data.dictionary.DictionaryRepositoryImpl
import fr.meteordesign.data.dictionary.datasource.remote.DictionaryRemoteDataSource
import fr.meteordesign.data.dictionary.datasource.remote.DictionaryRemoteDataSourceImpl
import fr.meteordesign.domain.repositories.DictionaryRepository

@Module
@InstallIn(SingletonComponent::class)
internal interface DictionaryModule {

    @Binds
    fun bindsDictionaryRepository(
        wordsRepositoryImpl: DictionaryRepositoryImpl,
    ): DictionaryRepository

    @Binds
    fun bindsDictionaryRemoteDataSource(
        dictionaryRemoteDataSourceImpl: DictionaryRemoteDataSourceImpl,
    ): DictionaryRemoteDataSource
}
