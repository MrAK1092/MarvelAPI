package com.example.myapplication.presentation.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFlowFragment
import com.example.myapplication.databinding.FragmentMainRootBinding
import com.example.myapplication.navigation.Navigator
import com.example.myapplication.navigation.NavigatorImpl
import com.example.myapplication.presentation.characters.CharactersFlowFragment
import com.example.myapplication.presentation.comics.ComicsFlowFragment
import com.example.myapplication.presentation.favorites.FavoritesFlowFragment

class MainRootFragment : Fragment(R.layout.fragment_main_root) {

    private val binding by viewBinding(FragmentMainRootBinding::bind)

    private var navigator: Navigator? = null

    private var flowComics: ComicsFlowFragment? = null
    private var flowCharacters: CharactersFlowFragment? = null
    private var flowFavorites: FavoritesFlowFragment? = null
    private var flowActive: BaseFlowFragment? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = NavigatorImpl(childFragmentManager, R.id.container)
        initFirstFlowFragment()
        initBottomNavigationView()
    }

    private fun initFirstFlowFragment() {
        flowComics = flowComics ?: kotlin.run { ComicsFlowFragment.newInstance() }
        flowComics?.let { loadFragment(it) }
        flowActive = flowComics
    }

    private fun initBottomNavigationView() {
        binding.navMenu.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.comics -> {
                    flowComics = flowComics ?: kotlin.run { ComicsFlowFragment.newInstance() }
                    flowComics?.let { loadFragment(it) }
                    flowActive = flowComics
                }
                R.id.character -> {
                    flowCharacters = flowCharacters ?: kotlin.run { CharactersFlowFragment.newInstance() }
                    flowCharacters?.let { loadFragment(it) }
                    flowActive = flowCharacters
                }
                R.id.favorites -> {
                    flowFavorites = flowFavorites ?: kotlin.run { FavoritesFlowFragment.newInstance() }
                    flowFavorites?.let { loadFragment(it) }
                    flowActive = flowFavorites
                }
            }
            true
        }
    }

    private fun loadFragment(fragment: BaseFlowFragment) {
        navigator?.replaceFlowFragment(fragment)
    }

    companion object {

        fun newInstance(): MainRootFragment = MainRootFragment()
    }
}