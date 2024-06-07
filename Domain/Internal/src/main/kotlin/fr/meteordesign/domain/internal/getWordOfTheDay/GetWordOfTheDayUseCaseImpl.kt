package fr.meteordesign.domain.internal.getWordOfTheDay

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.Word
import fr.meteordesign.domain.external.repositories.WordsRepository
import fr.meteordesign.domain.external.usecases.GetWordOfTheDayUseCase
import javax.inject.Inject

internal class GetWordOfTheDayUseCaseImpl @Inject constructor(
    private val wordsRepository: WordsRepository,
) : GetWordOfTheDayUseCase {
    override suspend operator fun invoke(): Result<Word, Unit> =
        wordsRepository.getWordList().firstOrNull()?.let {
            Result.Success(it)
        } ?: Result.Failure(Unit)
}
