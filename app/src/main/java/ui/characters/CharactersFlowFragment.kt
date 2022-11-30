package ui.characters

import android.os.Bundle
import android.view.View
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFlowFragment
import ui.characters.characters.CharactersFragment

class CharactersFlowFragment : BaseFlowFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            childFragmentManager
                .beginTransaction()
                .replace(R.id.flowContainer, CharactersFragment.newInstance())
                .commit()
        }
    }

    companion object {

        fun newInstance(): CharactersFlowFragment = CharactersFlowFragment()
    }
}