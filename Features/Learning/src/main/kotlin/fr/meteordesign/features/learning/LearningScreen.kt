package fr.meteordesign.features.learning

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun LearningScreen(
    viewModel: LearningViewModel = hiltViewModel(),
    onNavigateToIpaChar: () -> Unit,
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    LaunchedEffect(state.navigation) {
        viewModel.onNavigationCompleted()
        when (state.navigation) {
            LearningUiState.Navigation.None -> {}
            LearningUiState.Navigation.IpaChart ->
                onNavigateToIpaChar()
        }
    }

    LearningUiContent(
        state = state,
        onIpaCharClick = viewModel::onIpaCharClick,
    )
}
