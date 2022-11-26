package com.example.myapplication.presentation.favorites

import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFlowFragment
import com.example.myapplication.presentation.favorites.favorites.FavoritesFragment

class FavoritesFlowFragment : BaseFlowFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            childFragmentManager
                .beginTransaction()
                .replace(R.id.flowContainer, FavoritesFragment.newInstance())
                .commit()
        }
    }

    companion object {

        fun newInstance(): FavoritesFlowFragment = FavoritesFlowFragment()
    }
}