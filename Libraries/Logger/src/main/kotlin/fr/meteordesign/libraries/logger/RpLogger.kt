package fr.meteordesign.libraries.logger

import timber.log.Timber

fun initLogger() {
    if (BuildConfig.DEBUG) {
        Timber.plant(Timber.DebugTree())
    } else {
        // TODO create a release tree liked to Crashlytics
    }
}

@Suppress("NOTHING_TO_INLINE")
object RpLogger {

    inline fun d(message: String, throwable: Throwable? = null) =
        Timber.d(throwable, message, null)

    inline fun w(message: String, throwable: Throwable? = null) =
        Timber.w(throwable, message, null)

    inline fun e(message: String, throwable: Throwable? = null) =
        Timber.e(throwable, message, null)
}
