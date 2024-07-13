package fr.meteordesign.designSystem.molecules.dividers

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptDividerStylePreviewProvider : PreviewParameterProvider<RptDividerStyle> {
    override val values: Sequence<RptDividerStyle> =
        RptDividerStyle.entries.asSequence()
}
