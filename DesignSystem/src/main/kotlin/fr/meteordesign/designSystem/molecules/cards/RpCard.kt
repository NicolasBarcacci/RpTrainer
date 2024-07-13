package fr.meteordesign.designSystem.molecules.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.ThemedComponentPreviewContainer
import fr.meteordesign.designSystem.atoms.colors.RpPalette
import fr.meteordesign.designSystem.atoms.colors.color
import fr.meteordesign.designSystem.atoms.dimens.RpDimen
import fr.meteordesign.designSystem.atoms.dimens.RpElevation
import fr.meteordesign.designSystem.atoms.shapes.RpShape
import fr.meteordesign.designSystem.molecules.texts.RpText
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle

@Composable
fun RpCard(
    content: @Composable () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RpShape.RoundedCorner8dp.value,
        colors = CardDefaults.cardColors(
            containerColor = RpPalette.CardBackground.color(),
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = RpElevation.Medium.value,
        ),
    ) {
        content()
    }
}

@Preview
@Composable
private fun Preview() {
    ThemedComponentPreviewContainer {
        Box(
            modifier = Modifier
                .padding(RpDimen.Big.value),
        ) {
            RpCard {
                Box(
                    modifier = Modifier
                        .size(DefaultPreviewSize),
                    contentAlignment = Alignment.Center,
                ) {
                    RpText(style = RpTextStyle.Normal, text = "RpCard")
                }
            }
        }
    }
}
