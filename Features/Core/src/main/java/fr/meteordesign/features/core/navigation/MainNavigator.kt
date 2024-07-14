package fr.meteordesign.features.core.navigation

import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface MainNavigator {

    val route get() = Route

    fun NavGraphBuilder.buildMainComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
        onNavigateToIpaChar: () -> Unit,
    )

    @Serializable
    data object Route
}
