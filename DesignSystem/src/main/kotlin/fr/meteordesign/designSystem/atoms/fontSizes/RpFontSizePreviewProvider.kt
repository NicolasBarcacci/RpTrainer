package fr.meteordesign.designSystem.atoms.fontSizes

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpFontSizePreviewProvider : PreviewParameterProvider<RpFontSize> {
    override val values: Sequence<RpFontSize> =
        RpFontSize.entries.asSequence()
}
