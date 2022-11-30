package ui.favorites

import android.os.Bundle
import android.view.View
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFlowFragment
import ui.favorites.favorites.FavoritesFragment

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