package fr.meteordesign.ui.molecules.separator

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import fr.meteordesign.ui._common.RpOrientation
import fr.meteordesign.ui._common.ThemedComponentPreviewContainer
import fr.meteordesign.ui.atoms.dimens.RpDimen
import fr.meteordesign.ui.atoms.colors.RpPalette
import fr.meteordesign.ui.atoms.colors.color

@Composable
fun RpSeparator(
    orientation: RpOrientation,
) {
    when (orientation) {
        RpOrientation.Horizontal ->
            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = RpDimen.Medium.value),
                thickness = 1.dp,
                color = RpPalette.Separator.color(),
            )

        RpOrientation.Vertical ->
            VerticalDivider(
                modifier = Modifier
                    .padding(vertical = RpDimen.Medium.value),
                thickness = 1.dp,
                color = RpPalette.Separator.color(),
            )
    }
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(RpSeparatorPreviewProvider::class)
    rpOrientation: RpOrientation,
) {
    ThemedComponentPreviewContainer {
        RpSeparator(orientation = rpOrientation)
    }
}
