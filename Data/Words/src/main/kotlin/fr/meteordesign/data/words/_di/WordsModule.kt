package fr.meteordesign.data.words._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.domain.external.repositories.WordsRepository
import fr.meteordesign.data.words.WordsRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface WordsModule {

    @Binds
    fun bindsWordsRepository(
        wordsRepositoryImpl: WordsRepositoryImpl,
    ): WordsRepository
}
