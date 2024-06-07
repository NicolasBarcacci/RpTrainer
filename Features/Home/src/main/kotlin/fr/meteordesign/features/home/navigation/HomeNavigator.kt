package fr.meteordesign.features.home.navigation

import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface HomeNavigator {

    val route get() = Route::class

    fun NavGraphBuilder.buildHomeComposable()

    @Serializable
    data object Route
}
