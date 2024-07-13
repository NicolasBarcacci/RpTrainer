package fr.meteordesign.designSystem.molecules.spacers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem.atoms.colors.RptColor
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle
import fr.meteordesign.designSystem.molecules.texts.RptText

@Composable
fun RptSpacer(
    modifier: Modifier = Modifier,
    style: RptSpacerStyle,
    size: RptSpacerSize,
) {
    Spacer(
        modifier = modifier
            .size(style = style, size = size)
    )
}

@Composable
private fun Modifier.size(
    style: RptSpacerStyle,
    size: RptSpacerSize,
): Modifier =
    when (style) {
        RptSpacerStyle.Horizontal -> {
            this
                .width(size.dp())
                .height(0.dp)
        }

        RptSpacerStyle.Vertical -> {
            this
                .width(0.dp)
                .height(size.dp())
        }
    }

@Composable
@Preview
private fun Preview(
    @PreviewParameter(RpSpacerPreviewProvider::class)
    rpSpacerData: RpSpacerData,
) {
    Box(
        modifier = Modifier
            .size(DefaultPreviewSize)
            .background(RptColor.Blue.color()),
        contentAlignment = Alignment.Center,
    ) {
        when (rpSpacerData.rptSpacerStyle) {
            RptSpacerStyle.Horizontal ->
                PreviewHorizontalContent(rpSpacerData = rpSpacerData)

            RptSpacerStyle.Vertical ->
                PreviewVerticalContent(rpSpacerData = rpSpacerData)
        }
    }
}


@Composable
private fun PreviewHorizontalContent(
    rpSpacerData: RpSpacerData,
) {
    Row(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RptColor.White.color())
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RptText(
                style = RpTextStyle.Normal,
                text = rpSpacerData.rptSpacerStyle.name,
            )
        }
        RptSpacer(
            style = rpSpacerData.rptSpacerStyle,
            size = rpSpacerData.rptSpacerSize,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RptColor.White.color())
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RptText(
                style = RpTextStyle.Normal,
                text = rpSpacerData.rptSpacerSize.name,
            )
        }
    }
}

@Composable
private fun PreviewVerticalContent(
    rpSpacerData: RpSpacerData,
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RptColor.White.color())
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RptText(
                style = RpTextStyle.Normal,
                text = rpSpacerData.rptSpacerStyle.name,
            )
        }
        RptSpacer(
            style = rpSpacerData.rptSpacerStyle,
            size = rpSpacerData.rptSpacerSize,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RptColor.White.color())
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RptText(
                style = RpTextStyle.Normal,
                text = rpSpacerData.rptSpacerSize.name,
            )
        }
    }
}
