package com.example.myapplication.DI

import com.example.core.CatModule
import com.example.myapplication.MainActivity
import dagger.Component

@Component(modules = [CatModule::class])
interface MainComponent {
    @Component.Builder
    interface Builder{
        fun build(): MainComponent
    }
    fun inject(mainActivity: MainActivity)
}