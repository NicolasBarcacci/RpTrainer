package fr.meteordesign.data.core.tools

import android.content.Context
import androidx.annotation.RawRes
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

internal class RawFileReaderImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : RawFileReader {

    override fun read(
        @RawRes fileId: Int,
    ): String =
        context.resources.openRawResource(fileId).bufferedReader().use {
            it.readText()
        }
}
