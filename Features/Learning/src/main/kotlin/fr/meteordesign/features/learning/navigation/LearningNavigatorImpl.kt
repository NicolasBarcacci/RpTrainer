package fr.meteordesign.features.learning.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.learning.LearningScreen

internal class LearningNavigatorImpl : LearningNavigator {

    override fun NavGraphBuilder.buildLearningComposable() {
        composable<LearningNavigator.Route> {
            LearningScreen()
        }
    }
}
