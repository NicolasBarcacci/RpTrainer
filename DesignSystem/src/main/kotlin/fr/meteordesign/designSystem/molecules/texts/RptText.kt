package fr.meteordesign.designSystem.molecules.texts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptText(
    modifier: Modifier = Modifier,
    style: RptTextStyle,
    text: RptString,
) {
    Text(
        modifier = modifier,
        text = text.string(),
        color = style.color(),
        fontSize = style.fontSize(),
    )
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(RptTextStylePreviewProvider::class)
    rptTextStyle: RptTextStyle,
) {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .size(DefaultPreviewSize),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(RptPadding.Medium.dp()),
                contentAlignment = Alignment.CenterStart,
            ) {
                RptText(
                    style = rptTextStyle,
                    text = RptString.Text(rptTextStyle.name),
                )
            }
        }
    }
}
