package fr.meteordesign.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDay
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordClassUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordOfTheDayUiModel

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    Box(
        modifier = Modifier
            .padding(24.dp),
    ) {
        state.wordOfTheDay?.let {
            WordOfTheDay(model = it)
        }
    }
}

@Preview
@Composable
private fun Preview() {
    HomeContent(
        HomeUiState(
            wordOfTheDay = WordOfTheDayUiModel(
                writing = "Lorem Ipsum",
                wordClassList = listOf(
                    WordClassUiModel(
                        labelResId = fr.meteordesign.designSystem.R.string.word_type_undefined,
                        ipaWriting = IpaWritingUiModel.Strong("/Lorem Ipsum/"),
                    )
                )
            ),
        )
    )
}
