package fr.meteordesign.features.main.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.HomeNavigator
import fr.meteordesign.features.core.navigation.LearningNavigator
import fr.meteordesign.features.core.navigation.MainNavigator
import fr.meteordesign.features.main.MainScreen
import javax.inject.Inject

internal class MainNavigatorImpl @Inject constructor(
    private val homeNavigator: HomeNavigator,
    private val learningNavigator: LearningNavigator,
) : MainNavigator {

    override fun NavGraphBuilder.buildMainComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
        onNavigateToIpaChar: () -> Unit,
    ) {
        composable<MainNavigator.Route> {
            MainScreen(
                viewModel = hiltViewModel(viewModelStoreOwner),
                viewModelStoreOwner = viewModelStoreOwner,
                homeNavigator = homeNavigator,
                learningNavigator = learningNavigator,
                onNavigateToIpaChar = onNavigateToIpaChar,
            )
        }
    }
}
