package fr.meteordesign.ui.molecules.cards

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
import fr.meteordesign.ui._common.DefaultPreviewSize
import fr.meteordesign.ui._common.ThemedComponentPreviewContainer
import fr.meteordesign.ui.atoms.colors.RpPalette
import fr.meteordesign.ui.atoms.colors.color
import fr.meteordesign.ui.atoms.dimens.RpDimen
import fr.meteordesign.ui.atoms.dimens.RpElevation
import fr.meteordesign.ui.atoms.shapes.RpShape
import fr.meteordesign.ui.molecules.texts.RpText
import fr.meteordesign.ui.molecules.texts.RpTextStyle

@Composable
fun RpCard(
    content: @Composable () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
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
