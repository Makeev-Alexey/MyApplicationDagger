package com.example.myapplication.DI.ptovider

import com.example.myapplication.DI.MainComponent

interface MainComponentProvider {
    fun getMainComponent(): MainComponent
}