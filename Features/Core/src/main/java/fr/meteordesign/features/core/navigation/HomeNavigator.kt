package fr.meteordesign.features.core.navigation

import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface HomeNavigator {

    val route get() = Route::class

    fun NavGraphBuilder.buildHomeComposable()

    @Serializable
    data object Route
}
