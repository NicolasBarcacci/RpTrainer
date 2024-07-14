package fr.meteordesign.designSystem._common.previews

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Dark mode",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Preview(
    name = "Light mode",
    group = "Themes",
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
annotation class RptPreviewTheme
