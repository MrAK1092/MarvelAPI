package com.example.marvelapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelapi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import ui.ComicsItemFragment
import ui.PictureFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MarvelAPI)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.picture_holder, PictureFragment.newInstance())
            .commit()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.item_holder, ComicsItemFragment.newInstance())
            .commit()

        binding.navMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.comics -> {}

                R.id.character -> {}

                R.id.favorites -> {}
            }
            true
        }

    }
}