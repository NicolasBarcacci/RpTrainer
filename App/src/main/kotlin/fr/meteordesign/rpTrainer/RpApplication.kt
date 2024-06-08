package fr.meteordesign.rpTrainer

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import fr.meteordesign.libraries.logger.initLogger

@HiltAndroidApp
class RpApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogger()
    }
}
