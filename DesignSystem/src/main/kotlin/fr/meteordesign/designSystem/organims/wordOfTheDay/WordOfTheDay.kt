package fr.meteordesign.designSystem.organims.wordOfTheDay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.paddings.RptPadding
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.cards.RptCard
import fr.meteordesign.designSystem.molecules.spacers.RptSpacer
import fr.meteordesign.designSystem.molecules.spacers.RptSpacerSize
import fr.meteordesign.designSystem.molecules.spacers.RptSpacerStyle
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel.WordClass
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel.WordClass.IpaWriting

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
    writing: RptString,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        RptText(
            text = RptString.Android(R.string.word_of_the_day),
            style = RptTextStyle.Normal,
        )
        RptSpacer(
            style = RptSpacerStyle.Vertical,
            size = RptSpacerSize.Big,
        )
        RptText(
            text = writing,
            style = RptTextStyle.LargeTitle,
        )
        RptSpacer(
            style = RptSpacerStyle.Vertical,
            size = RptSpacerSize.Medium,
        )
    }
}

@Composable
private fun IpaWritingSection(
    wordClassList: List<WordClass>,
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
                        style = RptTextStyle.Normal,
                        text = it.label,
                    )
                }
                when (it.ipaWriting) {
                    is IpaWriting.Strong ->
                        IpaWriting(ipaWriting = it.ipaWriting)

                    is IpaWriting.WeakStrong ->
                        IpaWriting(ipaWriting = it.ipaWriting)
                }
            }
        }
    }
}

@Composable
fun IpaWriting(ipaWriting: IpaWriting.Strong) {
    RptText(
        style = RptTextStyle.Title,
        text = ipaWriting.strongForm,
    )
}

@Composable
fun IpaWriting(ipaWriting: IpaWriting.WeakStrong) {
    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RptText(
                style = RptTextStyle.Normal,
                text = RptString.Android(R.string.word_form_weak),
            )
            ipaWriting.weakFormList.forEach {
                RptText(
                    style = RptTextStyle.Title,
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
                style = RptTextStyle.Normal,
                text = RptString.Android(R.string.word_form_strong),
            )
            RptText(
                style = RptTextStyle.Title,
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
