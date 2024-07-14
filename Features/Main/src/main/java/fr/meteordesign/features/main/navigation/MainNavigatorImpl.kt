package fr.meteordesign.features.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.MainNavigator
import fr.meteordesign.features.main.MainScreen
import javax.inject.Inject

internal class MainNavigatorImpl @Inject constructor() : MainNavigator {

    override fun NavGraphBuilder.buildMainComposable() {
        composable<MainNavigator.Route> {
            MainScreen()
        }
    }
}
