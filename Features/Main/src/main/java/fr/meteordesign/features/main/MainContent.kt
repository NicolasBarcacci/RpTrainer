package fr.meteordesign.features.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import fr.meteordesign.designSystem.molecules.scaffolds.RptScaffold
import fr.meteordesign.designSystem.organims.navigationBars.RptNavigationBar
import fr.meteordesign.features.core.navigation.HomeNavigator
import fr.meteordesign.features.core.navigation.LearningNavigator

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    viewModelStoreOwner: ViewModelStoreOwner,
    navController: NavHostController,
    homeNavigator: HomeNavigator,
    learningNavigator: LearningNavigator,
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
                buildHomeComposable(viewModelStoreOwner)
            }
            with(learningNavigator) {
                buildLearningComposable(viewModelStoreOwner)
            }
        }
    }
}
