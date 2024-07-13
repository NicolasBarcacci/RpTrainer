package fr.meteordesign.data.core.tools

import androidx.annotation.RawRes

interface RawFileReader {

    fun read(
        @RawRes fileId: Int,
    ): String
}
