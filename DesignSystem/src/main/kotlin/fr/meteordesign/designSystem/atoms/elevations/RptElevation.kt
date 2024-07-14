package fr.meteordesign.designSystem.atoms.elevations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
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
import fr.meteordesign.designSystem.atoms.paddings.RptPadding

internal enum class RptElevation(private val value: Dp) {
    Medium(8.dp);

    @Composable
    fun dp(): Dp = value
}

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RptElevationPreviewProvider::class)
    rptElevation: RptElevation,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RptColor.White.color()),
        contentAlignment = Alignment.Center,
    ) {
        Surface(
            modifier = Modifier
                .padding(RptPadding.Big.dp()),
            shadowElevation = rptElevation.dp(),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(RptColor.White.color()),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = rptElevation.name,
                    color = RptColor.Black.color(),
                )
            }
        }
    }
}
