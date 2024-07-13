package fr.meteordesign.ui.molecules.texts

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.TextUnit
import fr.meteordesign.ui.atoms.colors.RpPalette
import fr.meteordesign.ui.atoms.colors.color
import fr.meteordesign.ui.atoms.fontSizes.RpFontSize

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
        RpTextStyle.Normal -> RpPalette.Text
    }.color()

@Composable
internal fun RpTextStyle.fontSize(): TextUnit =
    when (this) {
        RpTextStyle.LargeTitle -> RpFontSize.Massive
        RpTextStyle.Title -> RpFontSize.Large
        RpTextStyle.Subtitle -> RpFontSize.Big
        RpTextStyle.Normal -> RpFontSize.Medium
    }.value
