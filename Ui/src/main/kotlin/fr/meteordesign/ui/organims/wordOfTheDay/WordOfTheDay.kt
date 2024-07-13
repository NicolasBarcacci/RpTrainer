package fr.meteordesign.ui.organims.wordOfTheDay

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.ui.R
import fr.meteordesign.ui._common.RpOrientation
import fr.meteordesign.ui.atoms.dimens.RpPadding
import fr.meteordesign.ui.atoms.dimens.padding
import fr.meteordesign.ui.molecules.backgrounds.RpBackground
import fr.meteordesign.ui.molecules.cards.RpCard
import fr.meteordesign.ui.molecules.spacers.RpSpacer
import fr.meteordesign.ui.molecules.spacers.RpSpacerDimen
import fr.meteordesign.ui.molecules.texts.RpText
import fr.meteordesign.ui.molecules.texts.RpTextStyle
import fr.meteordesign.ui.molecules.themes.RpTheme
import fr.meteordesign.ui.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordClassUiModel
import fr.meteordesign.ui.organims.wordOfTheDay.models.WordOfTheDayUiModel

@Composable
fun WordOfTheDay(
    model: WordOfTheDayUiModel,
) {
    RpCard {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = RpPadding.Big,
                    vertical = RpPadding.Massive,
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HeaderSection(writing = model.writing)
            IpaWritingSection(wordClassList = model.wordClassList)
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
        RpSpacer(
            orientation = RpOrientation.Vertical,
            size = RpSpacerDimen.Medium,
        )
    }
}

@Composable
private fun IpaWritingSection(
    wordClassList: List<WordClassUiModel>,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        wordClassList.forEach {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                if (wordClassList.size > 1) {
                    RpText(
                        style = RpTextStyle.Normal,
                        text = stringResource(id = it.labelResId),
                    )
                }
                when (it.ipaWriting) {
                    is IpaWritingUiModel.Strong -> IpaWriting(ipaWriting = it.ipaWriting)
                    is IpaWritingUiModel.WeakStrong -> IpaWriting(ipaWriting = it.ipaWriting)
                }
            }
        }
    }
}

@Composable
fun IpaWriting(ipaWriting: IpaWritingUiModel.Strong) {
    RpText(
        style = RpTextStyle.Title,
        text = ipaWriting.strongForm,
    )
}

@Composable
fun IpaWriting(ipaWriting: IpaWritingUiModel.WeakStrong) {
    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RpText(
                style = RpTextStyle.Normal,
                text = stringResource(id = R.string.word_form_weak),
            )
            ipaWriting.weakFormList.forEach {
                RpText(
                    style = RpTextStyle.Title,
                    text = it,
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RpText(
                style = RpTextStyle.Normal,
                text = stringResource(id = R.string.word_form_strong),
            )
            RpText(
                style = RpTextStyle.Title,
                text = ipaWriting.strongForm,
            )
        }
    }
}

@Preview
@Composable
private fun Preview(
    @PreviewParameter(WordOfTheDayUiModelPreviewProvider::class)
    wordOfTheDayUiModel: WordOfTheDayUiModel,
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
