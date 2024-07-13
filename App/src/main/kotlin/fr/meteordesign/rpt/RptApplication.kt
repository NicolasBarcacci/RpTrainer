package fr.meteordesign.rpt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import fr.meteordesign.libraries.logger.initLogger

@HiltAndroidApp
class RptApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogger()
    }
}
