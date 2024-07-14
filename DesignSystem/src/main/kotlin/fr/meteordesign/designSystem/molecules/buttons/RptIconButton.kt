package fr.meteordesign.designSystem.molecules.buttons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.icons.RptIcon
import fr.meteordesign.designSystem.molecules.icons.RptIconStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptIconButton(
    modifier: Modifier = Modifier,
    image: RptImage,
    contentDescription: RptString,
    onClick: () -> Unit,
) {
    IconButton(
        modifier = modifier,
        onClick = onClick,
    ) {
        RptIcon(
            style = RptIconStyle.Medium,
            image = image,
            contentDescription = contentDescription,
        )
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
                RptIconButton(
                    image = RptImage.Android,
                    contentDescription = RptString.Text(""),
                    onClick = {},
                )
            }
        }
    }
}
