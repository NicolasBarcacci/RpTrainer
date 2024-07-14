package fr.meteordesign.features.home.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.HomeNavigator
import fr.meteordesign.features.home.HomeScreen
import javax.inject.Inject

class HomeNavigatorImpl @Inject constructor() : HomeNavigator {

    override fun NavGraphBuilder.buildHomeComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
    ) {
        composable<HomeNavigator.Route> {
            HomeScreen(
                viewModel = hiltViewModel(viewModelStoreOwner),
            )
        }
    }
}
