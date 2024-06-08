package fr.meteordesign.ui.atoms.dimens

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier

fun Modifier.padding(
    all: RpPadding,
): Modifier =
    this.padding(all = all.value)

fun Modifier.padding(
    horizontal: RpPadding = RpPadding.None,
    vertical: RpPadding = RpPadding.None,
): Modifier =
    this.padding(
        horizontal = horizontal.value,
        vertical = vertical.value,
    )

fun Modifier.padding(
    start: RpPadding = RpPadding.None,
    top: RpPadding = RpPadding.None,
    end: RpPadding = RpPadding.None,
    bottom: RpPadding = RpPadding.None,
): Modifier =
    this.padding(
        start = start.value,
        top = top.value,
        end = end.value,
        bottom = bottom.value,
    )
