package com.example.marvelapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.marvelapi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import data.model.DataBase
import ui.comics.comics.ComicsFragment
import ui.characters.characters.CharactersFragment

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MarvelAPI)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = DataBase.getDb(this)
        db.getDao().getAllItem().asLiveData().observe(this){

        }

        Thread{
            db.getDao().insertItem()
        }


    }
}









