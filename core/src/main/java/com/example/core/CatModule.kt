package com.example.core

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CatModule {
    @Provides
//    @Singleton
    fun getCat(): Cat{
        return Cat()
    }
}