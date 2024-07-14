package fr.meteordesign.designSystem.organims.topBar

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RptTopAppBarNavigationModePreviewProvider :
    PreviewParameterProvider<RptTopAppBarNavigationMode> {
    override val values: Sequence<RptTopAppBarNavigationMode> =
        RptTopAppBarNavigationMode.entries.asSequence()
}
