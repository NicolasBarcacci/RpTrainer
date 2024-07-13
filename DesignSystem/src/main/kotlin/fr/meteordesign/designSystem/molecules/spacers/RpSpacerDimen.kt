package fr.meteordesign.designSystem.molecules.spacers

import androidx.compose.ui.unit.Dp
import fr.meteordesign.designSystem.atoms.dimens.RpDimen

enum class RpSpacerDimen(internal val value: Dp) {
    Massive(RpDimen.Massive.value),
    Big(RpDimen.Big.value),
    Medium(RpDimen.Medium.value),
    Small(RpDimen.Small.value),
    Tiny(RpDimen.Tiny.value),
}
