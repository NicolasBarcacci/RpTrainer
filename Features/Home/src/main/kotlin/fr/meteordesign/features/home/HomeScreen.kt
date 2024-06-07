package fr.meteordesign.features.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
internal fun HomeScreen(
    viewModel: HomeViewModel,
) {
    val state = remember { viewModel.state }
    HomeContent(state)
}
