package fr.meteordesign.designSystem.molecules.backgrounds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptBackground(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .background(RptPalette.AppBackground.color()),
    ) {
        content()
    }
}

@Composable
@RptPreview
private fun Preview() {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .size(DefaultPreviewSize)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                RptText(
                    style = RptTextStyle.Normal,
                    text = RptString.Text("RpBackground"),
                )
            }
        }
    }
}
