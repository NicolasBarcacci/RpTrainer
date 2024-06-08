package fr.meteordesign.ui.molecules.spacers

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.ui._common.RpOrientation

internal class RpSpacerPreviewProvider : PreviewParameterProvider<RpSpacerData> {
    override val values: Sequence<RpSpacerData>
        get() {
            val rpOrientations = RpOrientation.entries
            val rpDimens = RpSpacerDimen.entries
            val matrix = mutableListOf<RpSpacerData>()
            rpOrientations.forEach { rpOrientation ->
                rpDimens.forEach { rpDimen ->
                    matrix.add(RpSpacerData(rpDimen, rpOrientation))
                }
            }
            return matrix.asSequence()
        }
}

internal data class RpSpacerData(
    val size: RpSpacerDimen,
    val orientation: RpOrientation,
)
