package fr.meteordesign.pratik.tools

import android.util.Log
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import javax.inject.Inject

class JsonParser @Inject constructor() {

    val moshi: Moshi = Moshi.Builder()
        .addLast(KotlinJsonAdapterFactory())
        .build()

    inline fun <reified Type> toJson(data: Type): String =
        moshi.adapter(Type::class.java).toJson(data)

    inline fun <reified Type> toObject(json: String): Type =
        try {
            moshi.adapter(Type::class.java).fromJson(json)
                ?: throw JsonParsingException("fromJson return null")
        } catch (e: JsonDataException) {
            throw JsonParsingException("JsonParser", e)
        }

    inline fun <reified Type> toObjectOrNull(json: String): Type? =
        try {
            toObject(json)
        } catch (e: JsonParsingException) {
            Log.e("JsonParser", e.toString())
            null
        }
}

class JsonParsingException(message: String, cause: Throwable? = null) : Exception(message, cause)
