package fr.meteordesign.designSystem.atoms.shapes

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptShapePreviewProvider : PreviewParameterProvider<RptShape> {
    override val values: Sequence<RptShape> =
        RptShape.entries.asSequence()
}
