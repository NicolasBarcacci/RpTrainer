package fr.meteordesign.features.ipaChart.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import fr.meteordesign.features.core.navigation.IpaChartNavigator
import fr.meteordesign.features.ipaChart.IpaChartScreen
import javax.inject.Inject

internal class IpaChartNavigatorImpl @Inject constructor() : IpaChartNavigator {

    override fun NavGraphBuilder.buildIpaChartComposable() {
        composable<IpaChartNavigator.Route> {
            IpaChartScreen()
        }
    }
}
