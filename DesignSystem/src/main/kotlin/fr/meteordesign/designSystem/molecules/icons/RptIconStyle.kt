package fr.meteordesign.designSystem.molecules.icons

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class RptIconStyle(private val value: Dp) {
    Medium(24.dp);

    @Composable
    fun dp(): Dp = value
}
