package fr.meteordesign.designSystem.organims.wordOfTheDay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.cards.RptCard
import fr.meteordesign.designSystem.molecules.spacers.RptSpacer
import fr.meteordesign.designSystem.molecules.spacers.RptSpacerSize
import fr.meteordesign.designSystem.molecules.spacers.RptSpacerStyle
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.themes.RptTheme
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.IpaWritingUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordClassUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.models.WordOfTheDayUiModel

@Composable
fun WordOfTheDay(
    modifier: Modifier = Modifier,
    model: WordOfTheDayUiModel,
) {
    RptCard(
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = RptPadding.Big.dp(),
                    vertical = RptPadding.Massive.dp(),
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
        RptText(
            text = stringResource(R.string.word_of_the_day),
            style = RpTextStyle.Normal,
        )
        RptSpacer(
            style = RptSpacerStyle.Vertical,
            size = RptSpacerSize.Big,
        )
        RptText(
            text = writing,
            style = RpTextStyle.LargeTitle,
        )
        RptSpacer(
            style = RptSpacerStyle.Vertical,
            size = RptSpacerSize.Medium,
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
                    RptText(
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
    RptText(
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
            RptText(
                style = RpTextStyle.Normal,
                text = stringResource(id = R.string.word_form_weak),
            )
            ipaWriting.weakFormList.forEach {
                RptText(
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
            RptText(
                style = RpTextStyle.Normal,
                text = stringResource(id = R.string.word_form_strong),
            )
            RptText(
                style = RpTextStyle.Title,
                text = ipaWriting.strongForm,
            )
        }
    }
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(WordOfTheDayUiModelPreviewProvider::class)
    wordOfTheDayUiModel: WordOfTheDayUiModel,
) {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .wrapContentSize(),
        ) {
            WordOfTheDay(
                modifier = Modifier
                    .padding(RptPadding.Big.dp()),
                model = wordOfTheDayUiModel,
            )
        }
    }
}
