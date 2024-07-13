package fr.meteordesign.designSystem._common.previews

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Small font",
    group = "font",
    fontScale = 0.5f,
)
@Preview(
    name = "Large font",
    group = "font",
    fontScale = 1.5f,
)
annotation class RptPreviewFont
