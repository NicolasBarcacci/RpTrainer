package fr.meteordesign.ui.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RpBackground(
    style: RpBackgroundStyle = RpBackgroundStyle.App,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(style.color()),
    ) {
        content()
    }
}

enum class RpBackgroundStyle {
    App,
}

@Composable
private fun RpBackgroundStyle.color(): Color =
    when (this) {
        RpBackgroundStyle.App -> SemanticColor.Background
    }.color()
