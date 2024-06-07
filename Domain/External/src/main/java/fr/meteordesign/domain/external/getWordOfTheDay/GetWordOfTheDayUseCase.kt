package fr.meteordesign.domain.external.getWordOfTheDay

interface GetWordOfTheDayUseCase {
    suspend operator fun invoke(): Word
}
