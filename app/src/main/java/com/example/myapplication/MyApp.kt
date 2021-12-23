package com.example.myapplication

import android.app.Application
import com.example.myapplication.DI.DaggerMainComponent
import com.example.myapplication.DI.MainComponent
import com.example.myapplication.DI.ptovider.MainComponentProvider

class MyApp: Application(), MainComponentProvider {


    override fun onCreate() {
        super.onCreate()

    }

    override fun getMainComponent(): MainComponent {
    return DaggerMainComponent.builder().build()
    }
}