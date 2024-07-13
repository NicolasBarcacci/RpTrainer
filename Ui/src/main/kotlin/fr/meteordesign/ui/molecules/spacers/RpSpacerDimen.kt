package fr.meteordesign.ui.molecules.spacers

import androidx.compose.ui.unit.Dp
import fr.meteordesign.ui.atoms.dimens.RpDimen

enum class RpSpacerDimen(internal val value: Dp) {
    Massive(RpDimen.Massive.value),
    Big(RpDimen.Big.value),
    Medium(RpDimen.Medium.value),
    Small(RpDimen.Small.value),
    Tiny(RpDimen.Tiny.value),
}
