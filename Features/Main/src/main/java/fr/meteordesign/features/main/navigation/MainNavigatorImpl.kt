package fr.meteordesign.features.main.navigation

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
    ) {
        composable<MainNavigator.Route> {
            MainScreen(
                viewModelStoreOwner = viewModelStoreOwner,
                homeNavigator = homeNavigator,
                learningNavigator = learningNavigator,
            )
        }
    }
}
