package fr.meteordesign.designSystem.organims.wordOfTheDay

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem.atoms.strings.RptString

internal class WordOfTheDayUiModelPreviewProvider :
    PreviewParameterProvider<WordOfTheDayUiModel> {
    override val values = sequenceOf(
        WordOfTheDayUiModel(
            writing = RptString.Text("dictionary"),
            wordClassList = listOf(
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_undefined),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.Strong(
                        strongForm = RptString.Text("/ˈdɪk.ʃᵊn.ᵊr.i/"),
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = RptString.Text("pneumonoultramicroscopicsilicovolcanoconiosis"),
            wordClassList = listOf(
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_undefined),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.Strong(
                        strongForm = RptString.Text("/njuːˌməʊ.nəʊˌʌl.trə.maɪ.krəˌskɒp.ɪkˌsɪl.ɪ.kəʊ.vɒl.keɪ.nəʊ.kɒn.iˈəʊ.sɪs/"),
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = RptString.Text("you"),
            wordClassList = listOf(
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_undefined),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.WeakStrong(
                        strongForm = RptString.Text("/juː/"),
                        weakFormList = listOf(
                            RptString.Text("/jə/"),
                            RptString.Text("/jʊ/"),
                        ),
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = RptString.Text("record"),
            wordClassList = listOf(
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_noun),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.Strong(
                        strongForm = RptString.Text("/ˈrek.ɔːd/"),
                    ),
                ),
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_verb),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.Strong(
                        strongForm = RptString.Text("/rɪˈkɔːd/"),
                    ),
                ),
            ),
        ),
        WordOfTheDayUiModel(
            writing = RptString.Text("Edge case"),
            wordClassList = listOf(
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_undefined),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.WeakStrong(
                        strongForm = RptString.Text("dolor"),
                        weakFormList = listOf(
                            RptString.Text("lorem"),
                            RptString.Text("ipsum"),
                        ),
                    ),
                ),
                WordOfTheDayUiModel.WordClass(
                    label = RptString.Android(R.string.word_type_undefined),
                    ipaWriting = WordOfTheDayUiModel.WordClass.IpaWriting.WeakStrong(
                        strongForm = RptString.Text("dolor"),
                        weakFormList = listOf(
                            RptString.Text("lorem"),
                            RptString.Text("ipsum"),
                        ),
                    ),
                ),
            ),
        ),
    )
}
