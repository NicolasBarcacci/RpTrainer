package fr.meteordesign.designSystem.atoms.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import fr.meteordesign.designSystem._common.LocalIsInDarkTheme

@Composable
internal fun RpPalette.color(): Color =
    if (LocalIsInDarkTheme.current) {
        this.darkThemeColor.value
    } else {
        this.lightThemeColor.value
    }
