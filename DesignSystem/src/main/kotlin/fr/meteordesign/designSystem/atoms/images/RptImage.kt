package fr.meteordesign.designSystem.atoms.images

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem.atoms.colors.RptColor
import fr.meteordesign.designSystem.atoms.paddings.RptPadding

enum class RptImage(
    @DrawableRes private val value: Int,
) {
    Android(R.drawable.ic_rounded_android),
    Drawer(R.drawable.ic_rounded_drawer),
    ArrowBack(R.drawable.ic_rounded_arrow_back),
    Home(R.drawable.ic_outline_home);

    @Composable
    fun imageVector(): ImageVector =
        ImageVector.vectorResource(id = value)
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptImagePreviewProvider::class)
    rptImage: RptImage,
) {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .background(RptColor.White.color())
            .padding(RptPadding.Medium.dp()),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            imageVector = rptImage.imageVector(),
            contentDescription = null,
            tint = RptColor.Black.color(),
        )
    }
}
