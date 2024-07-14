package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.atoms.fontSizes.RptFontSize

enum class RptTextStyle {
    LargeTitle,
    Title,
    Subtitle,
    Normal,
}

@Composable
internal fun RptTextStyle.color() =
    when (this) {
        RptTextStyle.LargeTitle,
        RptTextStyle.Title,
        RptTextStyle.Subtitle,
        RptTextStyle.Normal -> RptPalette.Text
    }.color()

@Composable
internal fun RptTextStyle.fontSize(): TextUnit =
    when (this) {
        RptTextStyle.LargeTitle -> RptFontSize.Massive
        RptTextStyle.Title -> RptFontSize.Large
        RptTextStyle.Subtitle -> RptFontSize.Big
        RptTextStyle.Normal -> RptFontSize.Medium
    }.sp()
