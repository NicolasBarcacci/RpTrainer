package fr.meteordesign.designSystem.molecules.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.previews.RptPreviewTheme
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptLargeButton(
    modifier: Modifier = Modifier,
    text: RptString,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier
            .fillMaxWidth(),
        colors = buttonColors(
            containerColor = RptPalette.Button.color(),
        ),
        onClick = onClick,
    ) {
        RptTheme(isInDarkTheme = true) {
            RptText(
                style = RptTextStyle.Normal,
                text = text,
            )
        }
    }
}

@Composable
@RptPreviewTheme
private fun Preview() {
    RptTheme {
        RptLargeButton(
            text = RptString.Text("Lorem Ipsum"),
            onClick = {},
        )
    }
}
