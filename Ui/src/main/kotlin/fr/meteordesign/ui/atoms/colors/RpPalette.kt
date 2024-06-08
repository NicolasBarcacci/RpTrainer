package fr.meteordesign.ui.atoms.colors

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.ui._common.ThemedComponentPreviewContainer
import fr.meteordesign.ui.molecules.texts.RpText
import fr.meteordesign.ui.molecules.texts.RpTextStyle
import fr.meteordesign.ui.molecules.themes.RpTheme

internal enum class RpPalette(
    internal val lightThemeColor: RpColor,
    internal val darkThemeColor: RpColor
) {
    AppBackground(lightThemeColor = RpColor.White, darkThemeColor = RpColor.BlueDarker),
    CardBackground(lightThemeColor = RpColor.White, darkThemeColor = RpColor.BlueDark),
    Text(lightThemeColor = RpColor.Black, darkThemeColor = RpColor.White),
    Separator(lightThemeColor = RpColor.BlueDarker, darkThemeColor = RpColor.White)
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpPalettePreviewProvider::class)
    rpPalette: RpPalette,
) {
    ThemedComponentPreviewContainer {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(rpPalette.color()),
            contentAlignment = Alignment.Center,
        ) {
            Column {
                RpTheme(isInDarkTheme = false) {
                    RpText(style = RpTextStyle.Normal, text = rpPalette.name)
                }
                RpTheme(isInDarkTheme = true) {
                    RpText(style = RpTextStyle.Normal, text = rpPalette.name)
                }
            }
        }
    }
}
