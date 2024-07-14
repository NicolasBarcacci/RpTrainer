package fr.meteordesign.features.core.navigation

import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface MainNavigator {

    val route get() = Route::class

    fun NavGraphBuilder.buildMainComposable()

    @Serializable
    data object Route
}
