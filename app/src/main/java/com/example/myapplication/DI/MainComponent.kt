package com.example.myapplication.DI

import com.example.myapplication.MainActivity
import dagger.Component

@Component
interface MainComponent {
    @Component.Builder
    interface Builder{
        fun build(): MainComponent
    }
    fun inject(mainActivity: MainActivity)
}