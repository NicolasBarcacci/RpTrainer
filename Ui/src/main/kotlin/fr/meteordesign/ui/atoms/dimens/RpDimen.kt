package fr.meteordesign.ui.atoms.dimens

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
import fr.meteordesign.ui._common.DefaultPreviewSize
import fr.meteordesign.ui.atoms.colors.RpColor

internal enum class RpDimen(val value: Dp) {
    Massive(24.dp),
    Big(16.dp),
    Medium(8.dp),
    Small(4.dp),
    Tiny(2.dp),
    None(0.dp),
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpDimenPreviewProvider::class)
    rpDimens: RpDimen,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RpColor.Red.value)
            .padding(rpDimens.value),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RpColor.Blue.value),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = rpDimens.name, color = RpColor.White.value)
        }
    }
}
