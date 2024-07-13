package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem._common.ThemedComponentPreviewContainer
import fr.meteordesign.designSystem.atoms.dimens.RpPadding
import fr.meteordesign.designSystem.atoms.dimens.padding

@Composable
fun RpText(
    style: RpTextStyle,
    text: String,
) {
    Text(
        text = text,
        color = style.color(),
        fontSize = style.fontSize(),
    )
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpTextStylePreviewProvider::class)
    rpTextStyle: RpTextStyle,
) {
    ThemedComponentPreviewContainer {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(RpPadding.Medium),
            contentAlignment = Alignment.CenterStart,
        ) {
            RpText(style = rpTextStyle, text = rpTextStyle.name)
        }
    }
}
