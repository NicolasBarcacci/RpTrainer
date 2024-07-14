package fr.meteordesign.designSystem.molecules.spacers

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class RptSpacerSize(private val value: Dp) {
    Massive(24.dp),
    Big(16.dp),
    Medium(8.dp),
    Small(4.dp),
    Tiny(2.dp);

    @Composable
    fun dp(): Dp = value
}
