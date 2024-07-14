package fr.meteordesign.designSystem.atoms.paddings

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptPaddingPreviewProvider : PreviewParameterProvider<RptPadding> {
    override val values: Sequence<RptPadding> =
        RptPadding.entries.asSequence()
}
