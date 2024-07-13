package fr.meteordesign.designSystem.atoms.colors

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptColorPreviewProvider : PreviewParameterProvider<RptColor> {
    override val values: Sequence<RptColor> =
        RptColor.entries.asSequence()
}
