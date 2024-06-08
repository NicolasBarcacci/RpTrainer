package fr.meteordesign.ui.atoms.shapes

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
import fr.meteordesign.ui._common.DefaultPreviewSize
import fr.meteordesign.ui.atoms.colors.RpColor

internal enum class RpShape(val value: Shape) {
    RoundedCorner8dp(RoundedCornerShape(8.dp)),
    Circular(CircleShape),
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpShapePreviewProvider::class)
    rpShape: RpShape,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .clip(rpShape.value)
            .background(color = RpColor.Red.value),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = rpShape.name, color = RpColor.White.value)
    }
}
