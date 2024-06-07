package fr.meteordesign.domain.external.usecases

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.Word

interface GetWordOfTheDayUseCase {
    suspend operator fun invoke(): Result<Word, Unit>
}
