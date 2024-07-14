package fr.meteordesign.designSystem.atoms.strings

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed interface RptString {
    @Composable
    fun string(): String

    data class Android(
        @StringRes val stringResId: Int,
    ) : RptString {

        @Composable
        override fun string(): String =
            stringResource(id = stringResId)
    }

    data class Text(
        val string: String,
    ) : RptString {

        @Composable
        override fun string(): String =
            string
    }
}
