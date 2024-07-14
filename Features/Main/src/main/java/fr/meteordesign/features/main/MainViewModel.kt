package fr.meteordesign.features.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.atoms.strings.RptString
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
    private var currentPageIndex = 0;

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
                navigation = nextDestination(selectedIndex),
                navigationBarUiModel = it.navigationBarUiModel.copy(
                    selectedIndex = selectedIndex,
                )
            )
        }
    }

    private fun nextDestination(
        selectedIndex: Int,
    ): MainUiState.Navigation {
        if (currentPageIndex == selectedIndex) return MainUiState.Navigation.None
        currentPageIndex = selectedIndex
        return when (selectedIndex) {
            0 -> MainUiState.Navigation.Home
            1 -> MainUiState.Navigation.Learning
            else -> MainUiState.Navigation.None
        }
    }

    private fun newRptNavigationBarUiModel(): RptNavigationBarUiModel =
        RptNavigationBarUiModel(
            itemList = listOf(
                RptNavigationBarUiModel.Item(
                    image = RptImage.Home,
                    contentDescription = RptString.Text("TODO"),
                    label = RptString.Android(R.string.navigation_item_home),
                ),
                RptNavigationBarUiModel.Item(
                    image = RptImage.School,
                    contentDescription = RptString.Text("TODO"),
                    label = RptString.Android(R.string.navigation_item_learning),
                )
            ),
            selectedIndex = 0,
        )
}
