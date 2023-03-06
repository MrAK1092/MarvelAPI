package com.example.marvelapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment
import com.example.marvelapi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import com.example.marvelapi.model.DataBase

import androidx.lifecycle.asLiveData


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

    fun obtainNavHostFragment(
        fragmentManager: FragmentManager,
        fragmentTag: String,
        navGraphId: Int,
        containerId: Int
    ): NavHostFragment {
        val existingFragment =
            fragmentManager.findFragmentByTag(fragmentTag) as NavHostFragment?
        existingFragment?.let { return it }
        val navHostFragment = NavHostFragment.create(navGraphId)
        fragmentManager.beginTransaction()
            .add(containerId, navHostFragment, fragmentTag)
            .commitNow()
        return navHostFragment
    }




}









