package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptTextStylePreviewProvider : PreviewParameterProvider<RptTextStyle> {
    override val values: Sequence<RptTextStyle> =
        RptTextStyle.entries.asSequence()
}
