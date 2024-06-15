package fr.meteordesign.jsonparser

import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import fr.meteordesign.libraries.logger.RpLogger
import javax.inject.Inject

class JsonParser @Inject constructor() {

    val moshi: Moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    inline fun <reified Type> toJson(data: Type): String =
        moshi.adapter(Type::class.java).toJson(data)

    inline fun <reified Type> fromJson(json: String): Type? =
        try {
            moshi.adapter(Type::class.java).fromJson(json)
        } catch (e: JsonDataException) {
            RpLogger.e("Unable to parse to ${Type::class}", e)
            null
        }
}
