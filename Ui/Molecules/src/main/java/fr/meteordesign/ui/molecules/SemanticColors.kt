package fr.meteordesign.ui.molecules

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import fr.meteordesign.ui.atoms.RpColor

enum class SemanticColor(val lightThemeColor: RpColor, val darkThemeColor: RpColor) {
    Background(lightThemeColor = RpColor.White, darkThemeColor = RpColor.Black),
    Text(lightThemeColor = RpColor.Black, darkThemeColor = RpColor.White),
}

@Composable
fun SemanticColor.color(): Color =
    if (LocalIsInDarkTheme.current) {
        this.darkThemeColor.value
    } else {
        this.lightThemeColor.value
    }
