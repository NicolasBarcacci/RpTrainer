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
import fr.meteordesign.ui.organims.wordOfTheDay.models.PhoneticTranscriptionUiModel
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
            Header(writing = model.writing)
            PhoneticTranscription(phoneticTranscription = model.phoneticTranscription)
        }
    }
}

@Composable
private fun Header(
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
private fun PhoneticTranscription(
    phoneticTranscription: PhoneticTranscriptionUiModel,
) {
    when (phoneticTranscription) {
        is PhoneticTranscriptionUiModel.Strong -> {
            MonoPhoneticTranscriptionBlock(
                phoneticTranscription = phoneticTranscription,
            )
        }

        is PhoneticTranscriptionUiModel.StrongWeak -> {
            DualPhoneticTranscriptionBlock(
                phoneticTranscription = phoneticTranscription,
            )
        }
    }
}

@Composable
private fun MonoPhoneticTranscriptionBlock(
    phoneticTranscription: PhoneticTranscriptionUiModel.Strong,
) {
    Column {
        RpSpacer(
            orientation = RpOrientation.Vertical,
            size = RpSpacerDimen.Medium,
        )
        PhoneticTranscriptionBlock(
            phoneticTranscriptionList = phoneticTranscription.strongIpaWordList,
        )
    }
}

@Composable
private fun DualPhoneticTranscriptionBlock(
    phoneticTranscription: PhoneticTranscriptionUiModel.StrongWeak,
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
                PhoneticTranscriptionBlock(
                    phoneticTranscriptionList = phoneticTranscription.weakIpaWordList,
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
                PhoneticTranscriptionBlock(
                    phoneticTranscriptionList = phoneticTranscription.strongIpaWordList,
                )
            }
        }
    }
}

@Composable
private fun PhoneticTranscriptionBlock(
    phoneticTranscriptionList: List<String>,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        phoneticTranscriptionList.forEach {
            PhoneticTranscription(phoneticTranscription = it)
        }
    }
}

@Composable
private fun PhoneticTranscription(phoneticTranscription: String) {
    RpText(
        text = phoneticTranscription,
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
            phoneticTranscription = PhoneticTranscriptionUiModel.Strong(
                strongIpaWordList = listOf("/ˈdɪk.ʃᵊn.ᵊr.i/"),
            )
        ),
        WordOfTheDayUiModel(
            writing = "can",
            phoneticTranscription = PhoneticTranscriptionUiModel.StrongWeak(
                strongIpaWordList = listOf("/kæn/"),
                weakIpaWordList = listOf("/kən/"),
            )
        ),
        WordOfTheDayUiModel(
            writing = "pneumonoultramicroscopicsilicovolcanoconiosis",
            phoneticTranscription = PhoneticTranscriptionUiModel.Strong(
                strongIpaWordList = listOf("/njuːˌməʊ.nəʊˌʌl.trə.maɪ.krəˌskɒp.ɪkˌsɪl.ɪ.kəʊ.vɒl.keɪ.nəʊ.kɒn.iˈəʊ.sɪs/"),
            )
        ),
    )
}
