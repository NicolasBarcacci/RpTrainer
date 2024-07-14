package fr.meteordesign.features.learning

import androidx.compose.runtime.Composable
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle

@Composable
internal fun LearningUiContent(
    state: LearningUiState,
) {
    RptText(style = RptTextStyle.Normal, text = state.toto)
}
