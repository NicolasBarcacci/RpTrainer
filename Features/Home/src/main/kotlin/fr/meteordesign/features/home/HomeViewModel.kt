package fr.meteordesign.features.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.meteordesign.domain.external.getWordOfTheDay.GetWordOfTheDayUseCase
import fr.meteordesign.features.home.mappers.toUiWord
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
internal class HomeViewModel @Inject constructor(
    private val getWordOfTheDayUseCase: GetWordOfTheDayUseCase,
) : ViewModel() {
    var state by mutableStateOf(
        HomeUiState(
            wordOfTheDay = null
        ),
    )
        private set

    init {
        viewModelScope.launch {
            state = HomeUiState(
                wordOfTheDay = getWordOfTheDayUseCase.invoke().toUiWord()
            )
        }
    }
}
