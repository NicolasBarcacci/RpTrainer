package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.rememberNavController
import fr.meteordesign.features.core.navigation.HomeNavigator
import fr.meteordesign.features.core.navigation.LearningNavigator

@Composable
internal fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    viewModelStoreOwner: ViewModelStoreOwner,
    homeNavigator: HomeNavigator,
    learningNavigator: LearningNavigator,
    onNavigateToIpaChar: () -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val navController = rememberNavController()

    LaunchedEffect(state.navigation) {
        viewModel.onNavigationCompleted()
        when (state.navigation) {
            MainUiState.Navigation.None -> {}

            MainUiState.Navigation.Home ->
                with(homeNavigator) {
                    navController.navigate(route)
                }

            MainUiState.Navigation.Learning ->
                with(learningNavigator) {
                    navController.navigate(route)
                }
        }
    }

    MainContent(
        state = state,
        navController = navController,
        viewModelStoreOwner = viewModelStoreOwner,
        homeNavigator = homeNavigator,
        learningNavigator = learningNavigator,
        onNavigationBarItemClick = viewModel::onNavigationItemClick,
        onNavigateToIpaChar = onNavigateToIpaChar,
    )
}
