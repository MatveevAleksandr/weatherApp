package ru.lpost.retrofittest.app

import android.app.Application
import ru.lpost.retrofittest.di.AppComponent
import ru.lpost.retrofittest.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}