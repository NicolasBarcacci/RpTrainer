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
import fr.meteordesign.designSystem._common.RpOrientation
import fr.meteordesign.designSystem.atoms.colors.RpColor
import fr.meteordesign.designSystem.molecules.texts.RpText
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle

@Composable
fun RpSpacer(
    orientation: RpOrientation,
    size: RpSpacerDimen,
) {
    Spacer(
        modifier = Modifier
            .size(size = size, orientation = orientation)
    )
}

private fun Modifier.size(
    size: RpSpacerDimen,
    orientation: RpOrientation,
): Modifier =
    when (orientation) {
        RpOrientation.Horizontal -> {
            this
                .width(size.value)
                .height(0.dp)
        }

        RpOrientation.Vertical -> {
            this
                .width(0.dp)
                .height(size.value)
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
            .background(RpColor.Blue.value),
        contentAlignment = Alignment.Center,
    ) {
        when (rpSpacerData.orientation) {
            RpOrientation.Horizontal ->
                PreviewHorizontalContent(rpSpacerData = rpSpacerData)

            RpOrientation.Vertical ->
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
                .background(RpColor.Red.value)
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RpText(style = RpTextStyle.Normal, text = rpSpacerData.orientation.name)
        }
        RpSpacer(
            size = rpSpacerData.size,
            orientation = rpSpacerData.orientation,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RpColor.Red.value)
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RpText(style = RpTextStyle.Normal, text = rpSpacerData.size.name)
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
                .background(RpColor.Red.value)
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RpText(style = RpTextStyle.Normal, text = rpSpacerData.orientation.name)
        }
        RpSpacer(
            size = rpSpacerData.size,
            orientation = rpSpacerData.orientation,
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(RpColor.Red.value)
                .weight(1f),
            contentAlignment = Alignment.Center,
        ) {
            RpText(style = RpTextStyle.Normal, text = rpSpacerData.size.name)
        }
    }
}
