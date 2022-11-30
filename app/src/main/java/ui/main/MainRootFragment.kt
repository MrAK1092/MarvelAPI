package ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFlowFragment
import com.example.marvelapi.databinding.FragmentMainRootBinding
import ui.characters.CharactersFlowFragment
import ui.characters.CharactersFlowFragment.Companion.newInstance
import ui.comics.ComicsFlowFragment
import ui.comics.comics.ComicsFragment.Companion.newInstance
import ui.favorites.FavoritesFlowFragment
import ui.main.MainRootFragment.Companion.newInstance

class MainRootFragment : Fragment(R.layout.fragment_main_root) {

    private val binding by viewBinding(FragmentMainRootBinding::bind)


    private var flowComics: ComicsFlowFragment? = null
    private var flowCharacters: CharactersFlowFragment? = null
    private var flowFavorites: FavoritesFlowFragment? = null
    private var flowActive: BaseFlowFragment? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
            when (menuItem.itemId) {
                R.id.comics -> {
                    flowComics = flowComics ?: kotlin.run { ComicsFlowFragment.newInstance() }
                    flowComics?.let { loadFragment(it) }
                    flowActive = flowComics
                }
                R.id.character -> {
                    flowCharacters =
                        flowCharacters ?: kotlin.run { CharactersFlowFragment.newInstance() }
                    flowCharacters?.let { loadFragment(it) }
                    flowActive = flowCharacters
                }
                R.id.favorites -> {
                    flowFavorites =
                        flowFavorites ?: kotlin.run { FavoritesFlowFragment.newInstance() }
                    flowFavorites?.let { loadFragment(it) }
                    flowActive = flowFavorites
                }
            }
            true
        }
    }


    companion object {

        fun newInstance(): MainRootFragment = MainRootFragment()
    }
}