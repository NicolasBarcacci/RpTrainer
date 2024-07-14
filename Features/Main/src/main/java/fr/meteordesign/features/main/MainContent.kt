package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import fr.meteordesign.designSystem.molecules.scaffolds.RptScaffold
import fr.meteordesign.designSystem.organims.navigationBars.RptNavigationBar
import fr.meteordesign.designSystem.organims.navigationBars.RptNavigationBarUiModel
import fr.meteordesign.features.core.navigation.HomeNavigator

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    homeNavigator: HomeNavigator,
    state: MainUiState,
    onNavigationBarItemClick: (Int) -> Unit,
) {
    RptScaffold(
        modifier = modifier,
        bottomBar = {
            RptNavigationBar(
                model = state.navigationBarUiModel,
                onNavigationBarItemClick = onNavigationBarItemClick,
            )
        },
    ) {
        NavHost(navController = navController, startDestination = homeNavigator.route) {
            with(homeNavigator) {
                buildHomeComposable()
            }
        }
    }
}
