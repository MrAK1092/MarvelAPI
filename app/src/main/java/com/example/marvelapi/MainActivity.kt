package com.example.marvelapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marvelapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MarvelAPI)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.comics -> {}

                R.id.character -> {}

                R.id.favorites -> {}
            }
        }
        true
    }
}