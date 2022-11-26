package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.navigation.NavigatorImpl
import com.example.myapplication.presentation.main.MainRootFragment

class MainActivity : AppCompatActivity() {

    private val navigator = NavigatorImpl(supportFragmentManager, R.id.container)

    private var mainRootFragment: MainRootFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            mainRootFragment = MainRootFragment.newInstance()
            mainRootFragment?.let {
                navigator.startNewFlow(it)
            }
        }
    }
}