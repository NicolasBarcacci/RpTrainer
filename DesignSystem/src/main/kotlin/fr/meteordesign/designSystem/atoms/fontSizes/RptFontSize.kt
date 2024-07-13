package fr.meteordesign.designSystem.atoms.fontSizes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem.atoms.colors.RptColor
import fr.meteordesign.designSystem.atoms.paddings.RptPadding

internal enum class RptFontSize(private val value: TextUnit) {
    Massive(28.sp),
    Large(20.sp),
    Big(16.sp),
    Medium(14.sp),
    Small(12.sp);

    @Composable
    fun sp(): TextUnit = value
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptFontSizePreviewProvider::class)
    rptFontSize: RptFontSize,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RptColor.White.color())
            .padding(RptPadding.Medium.dp()),
        contentAlignment = Alignment.CenterStart,
    ) {
        Text(
            text = rptFontSize.name,
            fontSize = rptFontSize.sp(),
            color = RptColor.Black.color(),
        )
    }
}
