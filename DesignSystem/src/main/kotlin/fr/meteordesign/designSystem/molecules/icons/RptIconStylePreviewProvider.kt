package fr.meteordesign.designSystem.molecules.icons

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptIconStylePreviewProvider : PreviewParameterProvider<RptIconStyle> {
    override val values: Sequence<RptIconStyle> =
        RptIconStyle.entries.asSequence()
}
