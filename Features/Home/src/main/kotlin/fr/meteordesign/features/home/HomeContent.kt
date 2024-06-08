package fr.meteordesign.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.features.home.models.PhoneticTranscriptionUiModel
import fr.meteordesign.features.home.models.WordUiModel
import fr.meteordesign.ui.molecules.RpText

@Composable
internal fun HomeContent(
    state: HomeUiState,
) {
    val wordOfTheDay = remember { state.wordOfTheDay }
    WordOfTheDay(wordOfTheDay = wordOfTheDay)
}

@Composable
private fun WordOfTheDay(wordOfTheDay: WordUiModel?) {
    wordOfTheDay?.let {
        Column {
            RpText(text = wordOfTheDay.writing)
            when (val phoneticTranscription = wordOfTheDay.phoneticTranscription) {
                is PhoneticTranscriptionUiModel.Strong -> {
                    Column {
                        phoneticTranscription.strongIpaWordList.forEach {
                            RpText(text = it)
                        }
                    }
                }

                is PhoneticTranscriptionUiModel.StrongWeak -> {
                    Row {
                        Column {
                            phoneticTranscription.weakIpaWordList.forEach {
                                RpText(text = it)
                            }
                        }
                        Column {
                            phoneticTranscription.strongIpaWordList.forEach {
                                RpText(text = it)
                            }
                        }
                    }
                }
            }
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
