package fr.meteordesign.designSystem.atoms.elevations

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptElevationPreviewProvider : PreviewParameterProvider<RptElevation> {
    override val values: Sequence<RptElevation> =
        RptElevation.entries.asSequence()
}