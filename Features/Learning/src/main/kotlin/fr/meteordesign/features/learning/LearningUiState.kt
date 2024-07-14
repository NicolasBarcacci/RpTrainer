package fr.meteordesign.features.learning

internal data class LearningUiState(
    val navigation: Navigation = Navigation.None,
) {

    sealed interface Navigation {
        data object None : Navigation
        data object IpaChart : Navigation
    }
}
