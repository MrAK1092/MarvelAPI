package ui.favorites.favorites

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFragment
import com.example.marvelapi.databinding.FragmentFavoritesBinding

class FavoritesFragment : BaseFragment(R.layout.fragment_favorites) {

    private val binding by viewBinding(FragmentFavoritesBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun newInstance(): FavoritesFragment = FavoritesFragment()
    }
}