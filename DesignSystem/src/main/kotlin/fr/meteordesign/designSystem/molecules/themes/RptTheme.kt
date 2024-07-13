package fr.meteordesign.designSystem.molecules.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.LocalIsInDarkTheme
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground

@Composable
fun RptTheme(
    isInDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme {
        CompositionLocalProvider(LocalIsInDarkTheme provides isInDarkTheme) {
            RptBackground(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                content()
            }
        }
    }
}
