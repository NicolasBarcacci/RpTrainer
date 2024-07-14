package fr.meteordesign.designSystem.organims.navigationBars

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem._common.previews.RptPreview
import fr.meteordesign.designSystem.atoms.images.RptImage
import fr.meteordesign.designSystem.atoms.strings.RptString
import fr.meteordesign.designSystem.molecules.icons.RptIcon
import fr.meteordesign.designSystem.molecules.icons.RptIconStyle
import fr.meteordesign.designSystem.molecules.palettes.RptPalette
import fr.meteordesign.designSystem.molecules.texts.RptText
import fr.meteordesign.designSystem.molecules.texts.RptTextStyle
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptNavigationBar(
    modifier: Modifier = Modifier,
    model: RptNavigationBarUiModel,
    onNavigationBarItemClick: (Int) -> Unit,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = RptPalette.NavigationBar.color(),
    ) {
        model.itemList.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    RptIcon(
                        style = RptIconStyle.Medium,
                        image = item.image,
                        contentDescription = item.contentDescription,
                    )
                },
                label = {
                    RptText(
                        style = RptTextStyle.Normal,
                        text = item.label,
                    )
                },
                onClick = { onNavigationBarItemClick(index) },
                selected = model.selectedIndex == index,
            )
        }
    }
}

@Composable
@RptPreview
private fun Preview() {
    RptTheme {
        RptNavigationBar(
            model = RptNavigationBarUiModel(
                itemList = listOf(
                    RptNavigationBarUiModel.Item(
                        image = RptImage.Android,
                        contentDescription = RptString.Text(""),
                        label = RptString.Text("Android"),
                    )
                ),
                selectedIndex = 0,
            ),
            onNavigationBarItemClick = {},
        )
    }
}
