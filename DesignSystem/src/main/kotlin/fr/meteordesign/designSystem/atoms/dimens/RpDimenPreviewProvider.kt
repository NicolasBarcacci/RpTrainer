package fr.meteordesign.designSystem.atoms.dimens

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpDimenPreviewProvider : PreviewParameterProvider<RpDimen> {
    override val values: Sequence<RpDimen> =
        RpDimen.entries.asSequence()
}
