package fr.meteordesign.designSystem.organims.topBar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewParameter
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.elevations.RptElevation
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.buttons.RptIconButton
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModel
import fr.meteordesign.designSystem.organims.wordOfTheDay.WordOfTheDayUiModelPreviewProvider

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RptTopAppBar(
    modifier: Modifier = Modifier,
    navigationMode: RptTopAppBarNavigationMode = RptTopAppBarNavigationMode.None,
    title: RptString,
    onNavigationPress: () -> Unit = {},
) {
    Surface(
        modifier = modifier,
        shadowElevation = RptElevation.Medium.dp(),
    ) {
        TopAppBar(
            title = {
                RptText(
                    style = RptTextStyle.Title,
                    text = title,
                )
            },
            navigationIcon = {
                NavigationIcon(
                    navigationMode = navigationMode,
                    onNavigationClick = onNavigationPress,
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = RptPalette.TopAppBar.color(),
            ),
        )
    }
}

@Composable
private fun NavigationIcon(
    navigationMode: RptTopAppBarNavigationMode,
    onNavigationClick: () -> Unit,
) {
    when (navigationMode) {
        RptTopAppBarNavigationMode.None -> {}
        RptTopAppBarNavigationMode.Drawer -> {
            RptIconButton(
                image = RptImage.Drawer,
                contentDescription = RptString.Text("TODO"),
                onClick = onNavigationClick,
            )
        }

        RptTopAppBarNavigationMode.Back -> {
            RptIconButton(
                image = RptImage.ArrowBack,
                contentDescription = RptString.Text("TODO"),
                onClick = onNavigationClick,
            )
        }
    }
}

@Composable
@RptPreview
private fun Preview(
    @PreviewParameter(RptTopAppBarNavigationModePreviewProvider::class)
    rptTopAppBarNavigationMode: RptTopAppBarNavigationMode,
) {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .fillMaxWidth()
                .height(DefaultPreviewSize),
        ) {
            RptTopAppBar(
                navigationMode = rptTopAppBarNavigationMode,
                title = RptString.Android(R.string.app_name),
            )
        }
    }
}
