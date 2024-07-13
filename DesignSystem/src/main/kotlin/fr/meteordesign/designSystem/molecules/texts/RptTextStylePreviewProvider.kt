package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptTextStylePreviewProvider : PreviewParameterProvider<RpTextStyle> {
    override val values: Sequence<RpTextStyle> =
        RpTextStyle.entries.asSequence()
}
