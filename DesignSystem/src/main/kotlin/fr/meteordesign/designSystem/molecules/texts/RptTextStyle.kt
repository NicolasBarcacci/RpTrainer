package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.atoms.fontSizes.RptFontSize

enum class RpTextStyle {
    LargeTitle,
    Title,
    Subtitle,
    Normal,
}

@Composable
internal fun RpTextStyle.color() =
    when (this) {
        RpTextStyle.LargeTitle,
        RpTextStyle.Title,
        RpTextStyle.Subtitle,
        RpTextStyle.Normal -> RptPalette.Text
    }.color()

@Composable
internal fun RpTextStyle.fontSize(): TextUnit =
    when (this) {
        RpTextStyle.LargeTitle -> RptFontSize.Massive
        RpTextStyle.Title -> RptFontSize.Large
        RpTextStyle.Subtitle -> RptFontSize.Big
        RpTextStyle.Normal -> RptFontSize.Medium
    }.sp()
