package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import fr.meteordesign.designSystem.molecules.scaffolds.RptScaffold
import fr.meteordesign.features.core.navigation.HomeNavigator

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    state: MainUiState,
    homeNavigator: HomeNavigator,
) {
    RptScaffold(
        modifier = modifier,
    ) {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = homeNavigator.route) {
            with(homeNavigator) {
                buildHomeComposable()
            }
        }
    }
}
