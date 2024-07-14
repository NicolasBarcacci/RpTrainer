package fr.meteordesign.features.ipaChart

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
internal class IpaCharViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(IpaChartUiState())
    val state: StateFlow<IpaChartUiState>
        get() = _state
}
