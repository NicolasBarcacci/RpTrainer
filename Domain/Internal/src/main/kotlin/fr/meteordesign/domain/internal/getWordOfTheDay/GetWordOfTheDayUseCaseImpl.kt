package fr.meteordesign.domain.internal.getWordOfTheDay

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.WordModel
import fr.meteordesign.domain.external.repositories.DictionaryRepository
import fr.meteordesign.domain.external.usecases.GetWordOfTheDayUseCase
import javax.inject.Inject

internal class GetWordOfTheDayUseCaseImpl @Inject constructor(
    private val dictionaryRepository: DictionaryRepository,
) : GetWordOfTheDayUseCase {
    override suspend operator fun invoke(): Result<WordModel, Unit> =
        when (val result = dictionaryRepository.getDictionary()) {
            is Result.Failure -> result
            is Result.Success ->
                result.data.wordList
                    .randomOrNull()?.let {
                        Result.Success(it)
                    } ?: Result.Failure(Unit)
        }
}
