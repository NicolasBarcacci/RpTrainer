package fr.meteordesign.ui.atoms.colors

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpPalettePreviewProvider : PreviewParameterProvider<RpPalette> {
    override val values: Sequence<RpPalette> =
        RpPalette.entries.asSequence()
}
