package fr.meteordesign.features.ipaChart

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun IpaChartScreen(
    viewModel: IpaCharViewModel = hiltViewModel(),
) {

    val state by viewModel.state.collectAsStateWithLifecycle()
    IpaChartContent(
        state = state,
    )
}
