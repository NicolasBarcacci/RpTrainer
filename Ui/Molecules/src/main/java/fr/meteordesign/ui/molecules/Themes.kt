package fr.meteordesign.ui.molecules

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

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

val LocalIsInDarkTheme = staticCompositionLocalOf { false }
