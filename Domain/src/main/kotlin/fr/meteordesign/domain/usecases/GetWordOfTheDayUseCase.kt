package fr.meteordesign.domain.usecases

import fr.meteordesign.domain.common.Result
import fr.meteordesign.domain.common.mapSuccess
import fr.meteordesign.domain.models.dictionary.WordModel
import fr.meteordesign.domain.repositories.DictionaryRepository
import javax.inject.Inject

class GetWordOfTheDayUseCase @Inject constructor(
    private val dictionaryRepository: DictionaryRepository,
) {

    suspend operator fun invoke(): Result<WordModel, Unit> =
        dictionaryRepository.getDictionary()
            .mapSuccess { data ->
                data.wordList.randomOrNull()?.let {
                    Result.Success(it)
                } ?: Result.Failure(Unit)
            }
}
