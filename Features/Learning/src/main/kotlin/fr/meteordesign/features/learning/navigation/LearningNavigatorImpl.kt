package fr.meteordesign.features.learning.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.LearningNavigator
import fr.meteordesign.features.learning.LearningScreen
import javax.inject.Inject

internal class LearningNavigatorImpl @Inject constructor() : LearningNavigator {

    override fun NavGraphBuilder.buildLearningComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
        onNavigateToIpaChar: () -> Unit,
    ) {
        composable<LearningNavigator.Route> {
            LearningScreen(
                viewModel = hiltViewModel(viewModelStoreOwner),
                onNavigateToIpaChar = onNavigateToIpaChar,
            )
        }
    }
}
