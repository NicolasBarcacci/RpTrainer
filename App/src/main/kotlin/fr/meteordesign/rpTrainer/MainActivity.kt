package fr.meteordesign.rpTrainer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import fr.meteordesign.ui.molecules.RpBackground
import fr.meteordesign.ui.molecules.RpText
import fr.meteordesign.ui.molecules.RpTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RpTheme {
                RpBackground {
                    RpText(text = "RP Trainer")
                }
            }
        }
    }
}
