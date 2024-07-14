package fr.meteordesign.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.meteordesign.domain.usecases.GetWordOfTheDayUseCase
import fr.meteordesign.features.home.mappers.toWordOfTheDayUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
internal class HomeViewModel @Inject constructor(
    private val getWordOfTheDayUseCase: GetWordOfTheDayUseCase,
) : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val state: StateFlow<HomeUiState>
        get() = _state

    init {
        viewModelScope.launch {
            _state.value = HomeUiState(
                wordOfTheDay = getWordOfTheDayUseCase.invoke()
                    .toWordOfTheDayUiModel()
            )
        }
    }
}
