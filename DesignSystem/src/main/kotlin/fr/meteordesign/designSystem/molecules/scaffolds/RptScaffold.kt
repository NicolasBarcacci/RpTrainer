package fr.meteordesign.designSystem.molecules.scaffolds

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.meteordesign.designSystem.molecules.backgrounds.RptBackground
import fr.meteordesign.designSystem.molecules.themes.RptTheme

@Composable
fun RptScaffold(
    modifier: Modifier,
    topBar: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    RptTheme {
        Scaffold(
            modifier = modifier,
            topBar = topBar,
        ) { paddingValues ->
            RptBackground(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                content(paddingValues)
            }
        }
    }
}
