package fr.meteordesign.ui._common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.meteordesign.ui.molecules.backgrounds.RpBackground
import fr.meteordesign.ui.molecules.themes.RpTheme

@Composable
internal fun ThemedComponentPreviewContainer(
    content: @Composable () -> Unit,
) {
    Row {
        ContentContainer(isInDarkTheme = false) {
            content()
        }
        ContentContainer(isInDarkTheme = true) {
            content()
        }
    }
}

@Composable
private fun ContentContainer(
    isInDarkTheme: Boolean,
    content: @Composable () -> Unit,
) {

    RpTheme(isInDarkTheme = isInDarkTheme) {
        Box(
            modifier = Modifier
                .size(DefaultPreviewSize)
        ) {
            RpBackground {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    content()
                }
            }
        }
    }
}
