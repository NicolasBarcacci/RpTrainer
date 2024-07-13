package fr.meteordesign.designSystem.molecules.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import fr.meteordesign.designSystem._common.LocalIsInDarkTheme

@Composable
fun RpTheme(
    isInDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme {
        CompositionLocalProvider(LocalIsInDarkTheme provides isInDarkTheme) {
            content()
        }
    }
}
