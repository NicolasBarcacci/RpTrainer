package fr.meteordesign.ui.molecules.separator

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.ui._common.RpOrientation

internal class RpSeparatorPreviewProvider : PreviewParameterProvider<RpOrientation> {
    override val values: Sequence<RpOrientation> =
        RpOrientation.entries.asSequence()
}
