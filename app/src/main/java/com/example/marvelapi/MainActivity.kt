package com.example.marvelapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelapi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import ui.ComicsItemFragment
import ui.PictureFragment
import ui.main.MainRootFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


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