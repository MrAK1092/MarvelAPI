package com.example.myapplication.presentation.comics.comics

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFragment
import com.example.myapplication.databinding.FragmentComicsBinding

class ComicsFragment : BaseFragment(R.layout.fragment_comics) {

    private val binding by viewBinding(FragmentComicsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun newInstance(): ComicsFragment = ComicsFragment()
    }
}