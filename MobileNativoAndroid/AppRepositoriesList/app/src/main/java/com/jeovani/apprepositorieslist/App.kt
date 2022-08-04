package com.jeovani.apprepositorieslist

import android.app.Application
import com.jeovani.apprepositorieslist.data.di.DataModulo
import com.jeovani.apprepositorieslist.domain.DomainModule
import com.jeovani.apprepositorieslist.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModulo.load()
        DomainModule.load()
        PresentationModule.load()

    }
}