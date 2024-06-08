package fr.meteordesign.ui.molecules.backgrounds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.ui._common.ThemedComponentPreviewContainer
import fr.meteordesign.ui.atoms.colors.RpPalette
import fr.meteordesign.ui.atoms.colors.color
import fr.meteordesign.ui.molecules.texts.RpText
import fr.meteordesign.ui.molecules.texts.RpTextStyle

@Composable
fun RpBackground(
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(RpPalette.AppBackground.color()),
    ) {
        content()
    }
}

@Composable
@Preview
private fun Preview() {
    ThemedComponentPreviewContainer {
        RpText(style = RpTextStyle.Normal, text = "RpBackground")
    }
}
