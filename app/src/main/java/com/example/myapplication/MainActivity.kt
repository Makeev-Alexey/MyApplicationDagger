package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.DI.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity(){
    lateinit var mainComponent: MainComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainComponent = (application as MyApp).mainComponent
        mainComponent.inject(this)
    }
}