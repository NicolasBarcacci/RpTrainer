package fr.meteordesign.designSystem.atoms.paddings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem.atoms.colors.RptColor

enum class RptPadding(private val value: Dp) {
    Massive(24.dp),
    Big(16.dp),
    Medium(8.dp),
    Small(4.dp),
    Tiny(2.dp),
    None(0.dp);

    @Composable
    fun dp(): Dp = value
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptPaddingPreviewProvider::class)
    rptPadding: RptPadding,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RptColor.White.color())
            .padding(rptPadding.dp()),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RptColor.Blue.color()),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = rptPadding.name,
                color = RptColor.White.color(),
            )
        }
    }
}
