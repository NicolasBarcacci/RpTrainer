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

internal enum class RptColor(
    private val value: Long,
) {
    Transparent(0x00000000),
    White(0xFFFFFFFF),
    Black(0xFF000000),
    Grey(0xFF333333),
    BlueDarker(0xFF000B3B),
    BlueDark(0xFF011856),
    Blue(0xFF012169),
    BlueLight(0xFF4D6496),
    BlueLighter(0xFFB3BCD2),
    RedDarker(0xFFA70512),
    RedDark(0xFFBB0C23),
    Red(0xFFC8102E),
    RedLight(0xFFD9586D),
    RedLighter(0xFFEFB7C0);

    @Composable
    fun color(): Color =
        Color(value)
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptColorPreviewProvider::class)
    rptColor: RptColor,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(rptColor.color()),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Text(text = rptColor.name, color = RptColor.Black.color())
            Text(text = rptColor.name, color = RptColor.White.color())
        }
    }
}
