package fr.meteordesign.features.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.meteordesign.ui.organims.wordOfTheDay.WordOfTheDay

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    Box(
        modifier = Modifier
            .padding(24.dp),
    ) {
        val wordOfTheDay = remember { state.wordOfTheDay }
        if (wordOfTheDay != null) {
            WordOfTheDay(model = wordOfTheDay)
        }
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
