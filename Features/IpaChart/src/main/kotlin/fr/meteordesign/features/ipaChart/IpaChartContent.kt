package fr.meteordesign.features.ipaChart

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun IpaChartContent(
    modifier: Modifier = Modifier,
    state: IpaChartUiState,
) {
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        RptText(
            style = RptTextStyle.Normal,
            text = state.title,
        )
    }
}

@Composable
@RptPreview
private fun Preview() {
    RptTheme {
        IpaChartContent(
            state = IpaChartUiState()
        )
    }
}
