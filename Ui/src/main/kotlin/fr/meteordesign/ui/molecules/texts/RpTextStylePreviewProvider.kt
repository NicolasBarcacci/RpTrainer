package fr.meteordesign.ui.molecules.texts

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpTextStylePreviewProvider : PreviewParameterProvider<RpTextStyle> {
    override val values: Sequence<RpTextStyle> =
        RpTextStyle.entries.asSequence()
}
