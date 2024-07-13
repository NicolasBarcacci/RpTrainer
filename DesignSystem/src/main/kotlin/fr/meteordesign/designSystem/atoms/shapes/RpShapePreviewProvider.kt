package fr.meteordesign.designSystem.atoms.shapes

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpShapePreviewProvider : PreviewParameterProvider<RpShape> {
    override val values: Sequence<RpShape> =
        RpShape.entries.asSequence()
}
