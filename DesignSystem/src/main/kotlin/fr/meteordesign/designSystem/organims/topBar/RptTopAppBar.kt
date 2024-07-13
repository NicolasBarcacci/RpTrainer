package fr.meteordesign.designSystem.organims.topBar

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import fr.meteordesign.designSystem.R
import fr.meteordesign.designSystem._common.DefaultPreviewSize
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.elevations.RptElevation
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.buttons.RptIconButton
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.texts.RpTextStyle
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RptTopAppBar(
    modifier: Modifier = Modifier,
    @StringRes titleResId: Int,
    navigationMode: RptTopAppBarNavigationMode = RptTopAppBarNavigationMode.None,
    onNavigationPress: () -> Unit = {},
) {
    Surface(
        modifier = modifier,
        shadowElevation = RptElevation.Medium.dp(),
    ) {
        TopAppBar(
            title = {
                RptText(
                    style = RpTextStyle.Title,
                    text = stringResource(id = titleResId),
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
                contentDescription = "TODO",
                onClick = onNavigationClick,
            )
        }

        RptTopAppBarNavigationMode.Back -> {
            RptIconButton(
                image = RptImage.Drawer,
                contentDescription = "TODO",
                onClick = onNavigationClick,
            )
        }
    }
}

@Composable
@RptPreview
private fun Preview() {
    RptTheme {
        RptBackground(
            modifier = Modifier
                .fillMaxWidth()
                .height(DefaultPreviewSize),
        ) {
            RptTopAppBar(
                titleResId = R.string.app_name,
                navigationMode = RptTopAppBarNavigationMode.Drawer,
            )
        }
    }
}
