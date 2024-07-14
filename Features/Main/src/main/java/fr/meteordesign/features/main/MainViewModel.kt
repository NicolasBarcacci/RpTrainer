package fr.meteordesign.features.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.organims.navigationBars.RptNavigationBarUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _state = MutableStateFlow(
        MainUiState(
            navigationBarUiModel = newRptNavigationBarUiModel(),
        )
    )
    val state: StateFlow<MainUiState>
        get() = _state

    fun onNavigationCompleted() {
        _state.update {
            it.copy(
                navigation = MainUiState.Navigation.None,
            )
        }
    }

    fun onNavigationItemClick(
        selectedIndex: Int,
    ) {
        _state.update {
            it.copy(
                navigation = MainUiState.Navigation.None,
                navigationBarUiModel = it.navigationBarUiModel.copy(
                    selectedIndex = selectedIndex,
                )
            )
        }
    }

    private fun newRptNavigationBarUiModel(): RptNavigationBarUiModel =
        RptNavigationBarUiModel(
            itemList = listOf(
                RptNavigationBarUiModel.Item(
                    image = RptImage.Home,
                    contentDescription = "TODO",
                    label = "Home",
                )
            ),
            selectedIndex = 0,
        )
}
