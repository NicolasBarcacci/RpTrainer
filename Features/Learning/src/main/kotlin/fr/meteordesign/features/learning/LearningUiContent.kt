package fr.meteordesign.features.learning

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem.R.string
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.buttons.RptLargeButton
import fr.meteordesign.designSystem.molecules.scaffolds.RptScaffold
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
internal fun LearningUiContent(
    modifier: Modifier = Modifier,
    state: LearningUiState,
    onIpaCharClick: () -> Unit,
) {
    RptScaffold(
        modifier = modifier,
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = RptPadding.Medium.dp()),
        ) {
            RptLargeButton(
                text = RptString.Android(string.navigation_ipa_char),
                onClick = onIpaCharClick,
            )
        }
    }
}

@Composable
@RptPreview
private fun Preview() {
    RptTheme {
        LearningUiContent(
            state = LearningUiState(),
            onIpaCharClick = {},
        )
    }
}
