package com.example.myapplication.presentation.favorites.favorites

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFragment
import com.example.myapplication.databinding.FragmentFavoritesBinding

class FavoritesFragment : BaseFragment(R.layout.fragment_favorites) {

    private val binding by viewBinding(FragmentFavoritesBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun newInstance(): FavoritesFragment = FavoritesFragment()
    }
}