package fr.meteordesign.designSystem.molecules.backgrounds

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.designSystem._common.ThemedComponentPreviewContainer
import fr.meteordesign.designSystem.atoms.colors.RpPalette
import fr.meteordesign.designSystem.atoms.colors.color
import fr.meteordesign.designSystem.molecules.texts.RpText
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle

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
