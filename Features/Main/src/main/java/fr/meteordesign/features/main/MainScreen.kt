package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import fr.meteordesign.features.core.navigation.HomeNavigator

@Composable
internal fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    homeNavigator: HomeNavigator,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val navController = rememberNavController()

    LaunchedEffect(state.navigation) {
        viewModel.onNavigationCompleted()
        when (state.navigation) {
            MainUiState.Navigation.None -> {}
            MainUiState.Navigation.Home -> {
                with(homeNavigator) {
                    navController.navigate(route)
                }
            }
        }
    }

    MainContent(
        state = state,
        navController = navController,
        homeNavigator = homeNavigator,
        onNavigationBarItemClick = viewModel::onNavigationItemClick,
    )
}
