package fr.meteordesign.features.core.navigation

import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface LearningNavigator {

    val route get() = Route

    fun NavGraphBuilder.buildLearningComposable(
        viewModelStoreOwner: ViewModelStoreOwner,
        onNavigateToIpaChar: () -> Unit,
    )

    @Serializable
    data object Route
}
