package fr.meteordesign.features.core.navigation

import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface HomeNavigator {

    val route get() = Route

    fun NavGraphBuilder.buildHomeComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
    )

    @Serializable
    data object Route
}
