package fr.meteordesign.domain.external.usecases

import fr.meteordesign.domain.external.common.Result
import fr.meteordesign.domain.external.models.WordModel

interface GetWordOfTheDayUseCase {
    suspend operator fun invoke(): Result<WordModel, Unit>
}
