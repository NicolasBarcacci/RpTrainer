package fr.meteordesign.designSystem.atoms.colors

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem._common.DefaultPreviewSize

internal enum class RpColor(val value: Color) {
    Transparent(Color(0x00000000)),
    White(Color(0xFFFFFFFF)),
    Black(Color(0xFF000000)),
    Grey(Color(0xFF333333)),
    BlueDarker(Color(0xFF000B3B)),
    BlueDark(Color(0xFF011856)),
    Blue(Color(0xFF012169)),
    BlueLight(Color(0xFF4D6496)),
    BlueLighter(Color(0xFFB3BCD2)),
    RedDarker(Color(0xFFA70512)),
    RedDark(Color(0xFFBB0C23)),
    Red(Color(0xFFC8102E)),
    RedLight(Color(0xFFD9586D)),
    RedLighter(Color(0xFFEFB7C0)),
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpColorPreviewProvider::class)
    rpColor: RpColor,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(rpColor.value),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Text(text = rpColor.name, color = RpColor.Black.value)
            Text(text = rpColor.name, color = RpColor.White.value)
        }
    }
}
