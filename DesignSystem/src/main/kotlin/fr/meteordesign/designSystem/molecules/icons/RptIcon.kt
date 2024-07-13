package fr.meteordesign.designSystem.molecules.icons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptIcon(
    modifier: Modifier = Modifier,
    style: RptIconStyle,
    image: RptImage,
    contentDescription: String?,
) {
    Icon(
        modifier = modifier
            .size(style.dp()),
        imageVector = image.imageVector(),
        contentDescription = contentDescription,
        tint = RptPalette.Icon.color(),
    )
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(RptIconStylePreviewProvider::class)
    rptIconStyle: RptIconStyle,
) {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .size(DefaultPreviewSize),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                RptIcon(
                    modifier = Modifier
                        .padding(all = RptPadding.Big.dp()),
                    style = rptIconStyle,
                    image = RptImage.Android,
                    contentDescription = null,
                )
            }
        }
    }
}
