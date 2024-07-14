package fr.meteordesign.features.learning

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun LearningScreen(
    viewModel: LearningViewModel = hiltViewModel(),
) {

    val state by viewModel.state.collectAsStateWithLifecycle()
    LearningUiContent(
        state = state,
    )
}
