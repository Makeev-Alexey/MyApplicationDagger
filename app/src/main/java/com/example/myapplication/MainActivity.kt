package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.core.Cat
import com.example.myapplication.DI.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(){
    lateinit var mainComponent: MainComponent
    @Inject
    lateinit var cat: Cat
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainComponent = (application as MyApp).getMainComponent()
        mainComponent.inject(this)
        println(cat)
    }
}