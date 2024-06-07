package fr.meteordesign.domain.internal.getWordOfTheDay

import fr.meteordesign.domain.external.getWordOfTheDay.GetWordOfTheDayUseCase
import fr.meteordesign.domain.external.getWordOfTheDay.Word
import javax.inject.Inject

internal class GetWordOfTheDayUseCaseImpl @Inject constructor() : GetWordOfTheDayUseCase {
    override suspend operator fun invoke(): Word = Word("toto")
}
