package fr.meteordesign.features.home

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fr.meteordesign.ui.molecules.RpText

@Composable
internal fun HomeContent(
    state: HomeState,
) {
    RpText(text = "HomeScreen")
}

@Preview
@Composable
private fun Preview() {
    HomeContent(HomeState)
}
