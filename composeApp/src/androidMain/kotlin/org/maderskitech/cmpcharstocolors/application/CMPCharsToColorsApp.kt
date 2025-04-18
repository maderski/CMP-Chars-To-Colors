package org.maderskitech.cmpcharstocolors.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.maderskitech.cmpcharstocolors.di.initKoin

class CMPCharsToColorsApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@CMPCharsToColorsApp)
            androidLogger()
        }
    }
}