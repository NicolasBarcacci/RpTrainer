package fr.meteordesign.features.learning.navigation

import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface LearningNavigator {

    val route get() = Route::class

    fun NavGraphBuilder.buildLearningComposable()

    @Serializable
    data object Route
}
