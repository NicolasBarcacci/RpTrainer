package fr.meteordesign.libraries.logger

import timber.log.Timber

fun initLogger() {
    if (BuildConfig.DEBUG) {
        Timber.plant(Timber.DebugTree())
    }
}

class RpLogger {

    companion object {

        fun d(message: String, throwable: Throwable?) =
            Timber.e(throwable, message, null)

        fun w(message: String, throwable: Throwable?) =
            Timber.e(throwable, message, null)

        fun e(message: String, throwable: Throwable?) =
            Timber.e(throwable, message, null)
    }
}
