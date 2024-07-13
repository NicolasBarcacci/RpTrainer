package fr.meteordesign.designSystem.atoms.images

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptImagePreviewProvider : PreviewParameterProvider<RptImage> {
    override val values: Sequence<RptImage> =
        RptImage.entries.asSequence()
}
