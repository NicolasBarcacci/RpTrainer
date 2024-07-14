package fr.meteordesign.designSystem.molecules.dividers

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptDivider(
    modifier: Modifier = Modifier,
    style: RptDividerStyle,
) {
    when (style) {
        RptDividerStyle.Vertical ->
            VerticalDivider(
                modifier = modifier,
                thickness = 1.dp,
                color = RptPalette.Separator.color(),
            )

        RptDividerStyle.Horizontal ->
            HorizontalDivider(
                modifier = modifier,
                thickness = 1.dp,
                color = RptPalette.Separator.color(),
            )
    }
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(RptDividerStylePreviewProvider::class)
    rptDividerStyle: RptDividerStyle,
) {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .size(DefaultPreviewSize),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                RptDivider(
                    modifier = Modifier
                        .padding(all = RptPadding.Big.dp()),
                    style = rptDividerStyle,
                )
            }
        }
    }
}
