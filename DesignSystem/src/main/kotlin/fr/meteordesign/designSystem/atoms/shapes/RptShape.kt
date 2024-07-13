package fr.meteordesign.designSystem.atoms.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem.atoms.colors.RptColor

internal enum class RptShape(val value: Shape) {
    RoundedCorner8dp(RoundedCornerShape(8.dp)),
    Circular(CircleShape),
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptShapePreviewProvider::class)
    rptShape: RptShape,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .clip(rptShape.value)
            .background(color = RptColor.White.color()),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = rptShape.name, color = RptColor.Black.color())
    }
}
