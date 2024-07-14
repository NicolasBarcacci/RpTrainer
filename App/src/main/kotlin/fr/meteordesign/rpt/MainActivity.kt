package fr.meteordesign.rpt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import fr.meteordesign.designSystem.molecules.themes.RptTheme
import fr.meteordesign.features.core.navigation.IpaChartNavigator
import fr.meteordesign.features.core.navigation.MainNavigator
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var mainNavigator: MainNavigator

    @Inject
    lateinit var ipaChartNavigator: IpaChartNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RptTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = mainNavigator.route) {
                    with(mainNavigator) {
                        buildMainComposable(
                            viewModelStoreOwner = this@MainActivity,
                            onNavigateToIpaChar = {
                                navController.navigate(ipaChartNavigator.route)
                            },
                        )
                    }
                    with(ipaChartNavigator) {
                        buildIpaChartComposable()
                    }
                }
            }
        }
    }
}
