package fr.meteordesign.designSystem.atoms.fontSizes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import fr.meteordesign.designSystem.atoms.colors.RpColor
import fr.meteordesign.designSystem.atoms.dimens.RpPadding
import fr.meteordesign.designSystem.atoms.dimens.padding

internal enum class RpFontSize(val value: TextUnit) {
    Massive(28.sp),
    Large(20.sp),
    Big(16.sp),
    Medium(14.sp),
    Small(12.sp),
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RpFontSizePreviewProvider::class)
    rpFontSize: RpFontSize,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RpColor.Red.value)
            .padding(RpPadding.Medium),
        contentAlignment = Alignment.CenterStart,
    ) {
        Text(
            text = rpFontSize.name,
            fontSize = rpFontSize.value,
            color = RpColor.White.value,
        )
    }
}
