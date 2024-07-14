package fr.meteordesign.features.core.navigation

import androidx.navigation.NavGraphBuilder
import kotlinx.serialization.Serializable

interface IpaChartNavigator {

    val route get() = Route

    fun NavGraphBuilder.buildIpaChartComposable()

    @Serializable
    data object Route
}
