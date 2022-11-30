package ui.characters.characters

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFragment
import com.example.marvelapi.databinding.FragmentCharactersBinding

class CharactersFragment : BaseFragment(R.layout.fragment_characters) {

    private val binding by viewBinding(FragmentCharactersBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    companion object {

        fun newInstance(): CharactersFragment = CharactersFragment()
    }
}