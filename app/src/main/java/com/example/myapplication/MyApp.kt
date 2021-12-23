package com.example.myapplication

import android.app.Application
import com.example.myapplication.DI.DaggerMainComponent
import com.example.myapplication.DI.MainComponent

class MyApp: Application() {
    lateinit var mainComponent: MainComponent
    override fun onCreate() {
        super.onCreate()
        mainComponent = DaggerMainComponent.builder().build()
    }
}