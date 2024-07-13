package fr.meteordesign.designSystem.atoms.fontSizes

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptFontSizePreviewProvider : PreviewParameterProvider<RptFontSize> {
    override val values: Sequence<RptFontSize> =
        RptFontSize.entries.asSequence()
}
