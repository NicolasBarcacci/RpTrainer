package fr.meteordesign.ui.atoms.colors

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpColorPreviewProvider : PreviewParameterProvider<RpColor> {
    override val values: Sequence<RpColor> =
        RpColor.entries.asSequence()
}
