package fr.meteordesign.designSystem.molecules.palettes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.LocalIsInDarkTheme
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.colors.RptColor
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

internal enum class RptPalette(
    private val lightThemeColor: RptColor,
    private val darkThemeColor: RptColor,
) {
    AppBackground(lightThemeColor = RptColor.White, darkThemeColor = RptColor.BlueDarker),
    CardBackground(lightThemeColor = RptColor.White, darkThemeColor = RptColor.BlueDark),
    Text(lightThemeColor = RptColor.Black, darkThemeColor = RptColor.White),
    Separator(lightThemeColor = RptColor.BlueDarker, darkThemeColor = RptColor.White),
    TopAppBar(lightThemeColor = RptColor.White, darkThemeColor = RptColor.BlueDark),
    Icon(lightThemeColor = RptColor.Black, darkThemeColor = RptColor.White),
    NavigationBar(lightThemeColor = RptColor.White, darkThemeColor = RptColor.BlueDark);

    @Composable
    fun color(): Color =
        if (LocalIsInDarkTheme.current) {
            this.darkThemeColor.color()
        } else {
            this.lightThemeColor.color()
        }
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(RptPalettePreviewProvider::class)
    rptPalette: RptPalette,
) {
    RptTheme {
        Box(
            modifier = Modifier
                .size(DefaultPreviewSize)
                .background(rptPalette.color()),
            contentAlignment = Alignment.Center,
        ) {
            Column {
                RptTheme(isInDarkTheme = false) {
                    RptText(
                        style = RptTextStyle.Normal,
                        text = RptString.Text(rptPalette.name),
                    )
                }
                RptTheme(isInDarkTheme = true) {
                    RptText(
                        style = RptTextStyle.Normal,
                        text = RptString.Text(rptPalette.name),
                    )
                }
            }
        }
    }
}
