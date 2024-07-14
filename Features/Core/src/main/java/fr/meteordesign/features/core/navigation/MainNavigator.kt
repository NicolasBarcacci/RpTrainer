package fr.meteordesign.features.core.navigation

import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface MainNavigator {

    val route get() = Route

    fun NavGraphBuilder.buildMainComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
    )

    @Serializable
    data object Route
}
