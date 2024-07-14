package fr.meteordesign.features.ipaChart.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.IpaChartNavigator
import fr.meteordesign.features.ipaChart.IpaChartScreen

internal class IpaChartNavigatorImpl : IpaChartNavigator {

    override fun NavGraphBuilder.buildIpaChartComposable() {
        composable<IpaChartNavigator.Route> {
            IpaChartScreen()
        }
    }
}
