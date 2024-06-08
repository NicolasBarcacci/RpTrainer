package fr.meteordesign.data.words._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.data.words.DictionaryRepositoryImpl
import fr.meteordesign.data.words.datasource.local.DictionaryLocalDataSource
import fr.meteordesign.data.words.datasource.local.DictionaryLocalDataSourceImpl
import fr.meteordesign.domain.external.repositories.DictionaryRepository

@Module
@InstallIn(SingletonComponent::class)
internal interface DictionaryModule {

    @Binds
    fun bindsDictionaryRepository(
        wordsRepositoryImpl: DictionaryRepositoryImpl,
    ): DictionaryRepository

    @Binds
    fun bindsDictionaryLocalDataSource(
        dictionaryLocalDataSourceImpl: DictionaryLocalDataSourceImpl,
    ): DictionaryLocalDataSource
}

