package fr.meteordesign.designSystem.molecules.separator

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.designSystem._common.RpOrientation

internal class RpSeparatorPreviewProvider : PreviewParameterProvider<RpOrientation> {
    override val values: Sequence<RpOrientation> =
        RpOrientation.entries.asSequence()
}
