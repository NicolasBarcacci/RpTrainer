package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import fr.meteordesign.features.core.navigation.HomeNavigator

@Composable
internal fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    homeNavigator: HomeNavigator,
) {

    val state by viewModel.state.collectAsStateWithLifecycle()
    MainContent(
        state = state,
        homeNavigator = homeNavigator,
    )
}
