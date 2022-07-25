package com.jeovani.appbusinesscard

import android.app.Application
import com.jeovani.appbusinesscard.data.AppDatabase
import com.jeovani.appbusinesscard.data.BusinessCardRepository

class App : Application() {
    private val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}