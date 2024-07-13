package fr.meteordesign.designSystem.molecules.spacers

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

internal class RpSpacerPreviewProvider : PreviewParameterProvider<RpSpacerData> {
    override val values: Sequence<RpSpacerData>
        get() {
            val rptSpacerStyle = RptSpacerStyle.entries
            val rptSpacerDimen = RptSpacerSize.entries
            val matrix = mutableListOf<RpSpacerData>()
            rptSpacerStyle.forEach { rpOrientation ->
                rptSpacerDimen.forEach { rpDimen ->
                    matrix.add(
                        RpSpacerData(rpOrientation, rpDimen)
                    )
                }
            }
            return matrix.asSequence()
        }
}

internal data class RpSpacerData(
    val rptSpacerStyle: RptSpacerStyle,
    val rptSpacerSize: RptSpacerSize,
)
