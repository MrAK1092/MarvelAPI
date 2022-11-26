package com.example.myapplication.presentation.characters.characters

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFragment
import com.example.myapplication.databinding.FragmentCharactersBinding

class CharactersFragment : BaseFragment(R.layout.fragment_characters) {

    private val binding by viewBinding(FragmentCharactersBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    companion object {

        fun newInstance(): CharactersFragment = CharactersFragment()
    }
}