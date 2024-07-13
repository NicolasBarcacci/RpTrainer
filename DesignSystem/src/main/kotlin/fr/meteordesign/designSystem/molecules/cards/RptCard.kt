package fr.meteordesign.designSystem.molecules.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.atoms.elevations.RptElevation
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.atoms.shapes.RptShape
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RptShape.RoundedCorner8dp.value,
        colors = CardDefaults.cardColors(
            containerColor = RptPalette.CardBackground.color(),
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = RptElevation.Medium.dp(),
        ),
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
            RptCard(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(RptPadding.Big.dp()),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center,
                ) {
                    RptText(style = RpTextStyle.Normal, text = "RpCard")
                }
            }
        }
    }
}
