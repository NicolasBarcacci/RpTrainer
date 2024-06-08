package fr.meteordesign.ui.molecules

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RpText(
    style: RpTextStyle = RpTextStyle.Default,
    text: String,
) {
    Text(
        text = text,
        color = style.color(),
    )
}

enum class RpTextStyle {
    Default,
}

@Composable
private fun RpTextStyle.color() =
    when (this) {
        RpTextStyle.Default -> SemanticColor.Text
    }.color()
