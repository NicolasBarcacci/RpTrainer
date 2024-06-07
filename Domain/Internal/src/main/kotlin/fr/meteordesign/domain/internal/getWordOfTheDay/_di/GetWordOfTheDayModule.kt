package fr.meteordesign.domain.internal.getWordOfTheDay._di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import fr.meteordesign.domain.external.usecases.GetWordOfTheDayUseCase
import fr.meteordesign.domain.internal.getWordOfTheDay.GetWordOfTheDayUseCaseImpl

@Module
@InstallIn(SingletonComponent::class)
internal interface GetWordOfTheDayModule {

    @Binds
    fun binds(
        getWordOfTheDayUseCaseImpl: GetWordOfTheDayUseCaseImpl,
    ): GetWordOfTheDayUseCase
}
