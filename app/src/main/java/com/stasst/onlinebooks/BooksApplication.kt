package com.stasst.onlinebooks

import android.app.Application
import com.stasst.onlinebooks.data.AppContainer
import com.stasst.onlinebooks.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}