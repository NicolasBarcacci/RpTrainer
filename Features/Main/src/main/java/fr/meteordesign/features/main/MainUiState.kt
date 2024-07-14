package fr.meteordesign.features.main

import fr.meteordesign.designSystem.organims.navigationBars.RptNavigationBarUiModel

data class MainUiState(
    val navigation: Navigation = Navigation.None,
    val navigationBarUiModel: RptNavigationBarUiModel,
) {

    sealed interface Navigation {
        data object None : Navigation
        data object Home : Navigation
        data object Learning : Navigation
    }
}
