package fr.meteordesign.rpt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import fr.meteordesign.features.home.navigation.HomeNavigator
import fr.meteordesign.designSystem.molecules.backgrounds.RpBackground
import fr.meteordesign.designSystem.molecules.themes.RpTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var homeNavigator: HomeNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RpTheme {
                RpBackground {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = homeNavigator.route) {
                        with(homeNavigator) {
                            buildHomeComposable()
                        }
                    }
                }
            }
        }
    }
}
