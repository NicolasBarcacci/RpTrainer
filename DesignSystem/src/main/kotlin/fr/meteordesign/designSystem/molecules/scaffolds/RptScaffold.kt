package fr.meteordesign.designSystem.molecules.scaffolds

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem.molecules.palettes.RptPalette

@Composable
fun RptScaffold(
    modifier: Modifier,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        containerColor = RptPalette.AppBackground.color(),
    ) { paddingValues ->
        content(paddingValues)
    }
}
