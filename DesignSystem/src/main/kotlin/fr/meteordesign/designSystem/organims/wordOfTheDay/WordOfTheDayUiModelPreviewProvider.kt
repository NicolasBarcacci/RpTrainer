package fr.meteordesign.designSystem.organims.wordOfTheDay

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordClassUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordOfTheDayUiModel

internal class WordOfTheDayUiModelPreviewProvider :
    PreviewParameterProvider<WordOfTheDayUiModel> {
    override val values = sequenceOf(
        WordOfTheDayUiModel(
            writing = "dictionary",
            wordClassList = listOf(
                WordClassUiModel(
                    labelResId = R.string.word_type_undefined,
                    ipaWriting = IpaWritingUiModel.Strong(
                        strongForm = "/ˈdɪk.ʃᵊn.ᵊr.i/"
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = "pneumonoultramicroscopicsilicovolcanoconiosis",
            wordClassList = listOf(
                WordClassUiModel(
                    labelResId = R.string.word_type_undefined,
                    ipaWriting = IpaWritingUiModel.Strong(
                        strongForm = "/njuːˌməʊ.nəʊˌʌl.trə.maɪ.krəˌskɒp.ɪkˌsɪl.ɪ.kəʊ.vɒl.keɪ.nəʊ.kɒn.iˈəʊ.sɪs/",
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = "you",
            wordClassList = listOf(
                WordClassUiModel(
                    labelResId = R.string.word_type_undefined,
                    ipaWriting = IpaWritingUiModel.WeakStrong(
                        strongForm = "/juː/",
                        weakFormList = listOf(
                            "/jə/",
                            "/jʊ/",
                        ),
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = "record",
            wordClassList = listOf(
                WordClassUiModel(
                    labelResId = R.string.word_type_noun,
                    ipaWriting = IpaWritingUiModel.Strong(
                        strongForm = "/ˈrek.ɔːd/",
                    ),
                ),
                WordClassUiModel(
                    labelResId = R.string.word_type_verb,
                    ipaWriting = IpaWritingUiModel.Strong(
                        strongForm = "/rɪˈkɔːd/",
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = "Edge case",
            wordClassList = listOf(
                WordClassUiModel(
                    labelResId = R.string.word_type_undefined,
                    ipaWriting = IpaWritingUiModel.WeakStrong(
                        strongForm = "dolor",
                        weakFormList = listOf(
                            "lorem",
                            "ipsum",
                        ),
                    ),
                ),
                WordClassUiModel(
                    labelResId = R.string.word_type_undefined,
                    ipaWriting = IpaWritingUiModel.WeakStrong(
                        strongForm = "dolor",
                        weakFormList = listOf(
                            "lorem",
                            "ipsum",
                        ),
                    ),
                ),
            ),
        ),
    )
}
