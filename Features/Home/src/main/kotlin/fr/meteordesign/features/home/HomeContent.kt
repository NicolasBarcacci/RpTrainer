package fr.meteordesign.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.scaffolds.RptScaffold
import fr.meteordesign.designSystem.organims.topBar.RptTopAppBar
import fr.meteordesign.designSystem.organims.topBar.RptTopAppBarNavigationMode
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDay
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel

@Composable
internal fun HomeContent(
    modifier: Modifier = Modifier,
    state: HomeUiState,
) {
    RptScaffold(
        modifier = modifier,
        topBar = {
            RptTopAppBar(
                title = RptString.Android(R.string.app_name),
                navigationMode = RptTopAppBarNavigationMode.None,
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding),
        ) {
            Column {
                state.wordOfTheDayUiModel?.let {
                    WordOfTheDay(
                        modifier = Modifier
                            .padding(top = RptPadding.Big.dp())
                            .padding(horizontal = RptPadding.Big.dp()),
                        model = it
                    )
                }
            }
        }
    }
}

@Composable
@RptPreview
private fun Preview() {
    HomeContent(
        state = HomeUiState(
            wordOfTheDayUiModel = WordOfTheDayUiModel(
                writing = RptString.Text("Lorem Ipsum"),
                wordClassList = listOf(
                    WordOfTheDayUiModel.WordClass(
                        label = RptString.Android(R.string.word_type_undefined),
                        ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.Strong(
                            RptString.Text("/Lorem Ipsum/"),
                        ),
                    )
                )
            ),
        ),
    )
}
