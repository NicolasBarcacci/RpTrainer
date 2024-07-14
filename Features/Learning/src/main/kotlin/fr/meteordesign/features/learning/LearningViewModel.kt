package fr.meteordesign.features.learning

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
internal class LearningViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(LearningUiState())
    val state: StateFlow<LearningUiState>
        get() = _state

    fun onNavigationCompleted() {
        _state.update {
            it.copy(
                navigation = LearningUiState.Navigation.None,
            )
        }
    }

    fun onIpaCharClick() {
        _state.update {
            it.copy(
                navigation = LearningUiState.Navigation.IpaChart,
            )
        }
    }
}
