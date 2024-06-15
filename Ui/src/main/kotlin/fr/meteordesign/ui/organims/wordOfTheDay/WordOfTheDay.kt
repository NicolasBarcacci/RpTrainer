package fr.meteordesign.ui.organims.wordOfTheDay

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import fr.meteordesign.ui.R
import fr.meteordesign.ui._common.RpOrientation
import fr.meteordesign.ui.atoms.dimens.RpPadding
import fr.meteordesign.ui.atoms.dimens.padding
import fr.meteordesign.ui.molecules.backgrounds.RpBackground
import fr.meteordesign.ui.molecules.cards.RpCard
import fr.meteordesign.ui.molecules.separator.RpSeparator
import fr.meteordesign.ui.molecules.spacers.RpSpacer
import fr.meteordesign.ui.molecules.spacers.RpSpacerDimen
import fr.meteordesign.ui.molecules.texts.RpText
import fr.meteordesign.ui.molecules.texts.RpTextStyle
import fr.meteordesign.ui.molecules.themes.RpTheme
import fr.meteordesign.ui.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordOfTheDayUiModel

@Composable
fun WordOfTheDay(
    model: WordOfTheDayUiModel,
) {
    RpCard {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(
                    horizontal = RpPadding.Big,
                    vertical = RpPadding.Massive,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HeaderSection(writing = model.writing)
            IpaWritingSection(ipaWriting = model.ipaWriting)
        }
    }
}

@Composable
private fun HeaderSection(
    writing: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        RpText(
            text = stringResource(R.string.word_of_the_day),
            style = RpTextStyle.Normal,
        )
        RpSpacer(
            orientation = RpOrientation.Vertical,
            size = RpSpacerDimen.Big,
        )
        RpText(
            text = writing,
            style = RpTextStyle.LargeTitle,
        )
    }
}

@Composable
private fun IpaWritingSection(
    ipaWriting: IpaWritingUiModel,
) {
    when (ipaWriting) {
        is IpaWritingUiModel.Strong -> {
            MonoIpaWritingSection(
                ipaWriting = ipaWriting,
            )
        }

        is IpaWritingUiModel.StrongWeak -> {
            DualIpaWritingSection(
                ipaWriting = ipaWriting,
            )
        }
    }
}

@Composable
private fun MonoIpaWritingSection(
    ipaWriting: IpaWritingUiModel.Strong,
) {
    Column {
        RpSpacer(
            orientation = RpOrientation.Vertical,
            size = RpSpacerDimen.Medium,
        )
        PhoneticTranscription(
            ipaWriting = ipaWriting.strongForm,
        )
    }
}

@Composable
private fun DualIpaWritingSection(
    ipaWriting: IpaWritingUiModel.StrongWeak,
) {
    Column {
        RpSpacer(
            orientation = RpOrientation.Vertical,
            size = RpSpacerDimen.Small,
        )
        Row {
            Column(
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                RpText(
                    style = RpTextStyle.Normal,
                    text = "Weak"
                )
                MultiplePhoneticTranscription(
                    ipaWritingList = ipaWriting.weakFormList,
                )
            }
            RpSeparator(orientation = RpOrientation.Vertical)
            Column(
                modifier = Modifier
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                RpText(
                    style = RpTextStyle.Normal,
                    text = "Strong"
                )
                PhoneticTranscription(
                    ipaWriting = ipaWriting.strongForm,
                )
            }
        }
    }
}

@Composable
private fun MultiplePhoneticTranscription(
    ipaWritingList: List<String>,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ipaWritingList.forEach {
            PhoneticTranscription(ipaWriting = it)
        }
    }
}

@Composable
private fun PhoneticTranscription(ipaWriting: String) {
    RpText(
        text = ipaWriting,
        style = RpTextStyle.Title
    )
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(WordOfTheDayUiModelPreviewParameterProvider::class) wordOfTheDayUiModel: WordOfTheDayUiModel,
) {
    RpTheme {
        RpBackground {
            Box(
                modifier = Modifier
                    .padding(RpPadding.Big)
            ) {
                WordOfTheDay(wordOfTheDayUiModel)
            }
        }
    }
}

class WordOfTheDayUiModelPreviewParameterProvider :
    PreviewParameterProvider<WordOfTheDayUiModel> {
    override val values = sequenceOf(
        WordOfTheDayUiModel(
            writing = "dictionary",
            ipaWriting = IpaWritingUiModel.Strong(
                strongForm = "/ˈdɪk.ʃᵊn.ᵊr.i/",
            )
        ),
        WordOfTheDayUiModel(
            writing = "can",
            ipaWriting = IpaWritingUiModel.StrongWeak(
                strongForm = "/kæn/",
                weakFormList = listOf("/kən/"),
            )
        ),
        WordOfTheDayUiModel(
            writing = "pneumonoultramicroscopicsilicovolcanoconiosis",
            ipaWriting = IpaWritingUiModel.Strong(
                strongForm = "/njuːˌməʊ.nəʊˌʌl.trə.maɪ.krəˌskɒp.ɪkˌsɪl.ɪ.kəʊ.vɒl.keɪ.nəʊ.kɒn.iˈəʊ.sɪs/",
            )
        ),
    )
}
