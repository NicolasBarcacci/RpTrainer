package fr.meteordesign.features.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.ui.molecules.RpText

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    val wordOfTheDay = remember { state.wordOfTheDay }
    WordOfTheDay(wordOfTheDay = wordOfTheDay)
}

@Composable
private fun WordOfTheDay(wordOfTheDay: UiWord?) {
    wordOfTheDay?.let {
        RpText(text = wordOfTheDay.writing)
    }
}

@Preview
@Composable
private fun Preview() {
    HomeContent(
        HomeUiState(
            wordOfTheDay = null,
        )
    )
}
