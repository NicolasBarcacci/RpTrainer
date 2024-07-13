package fr.meteordesign.designSystem.molecules.palettes

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptPalettePreviewProvider : PreviewParameterProvider<RptPalette> {
    override val values: Sequence<RptPalette> =
        RptPalette.entries.asSequence()
}