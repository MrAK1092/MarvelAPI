package com.example.myapplication.presentation.comics

import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication._commons.base_components.BaseFlowFragment
import com.example.myapplication.presentation.comics.comics.ComicsFragment

class ComicsFlowFragment : BaseFlowFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            childFragmentManager
                .beginTransaction()
                .replace(R.id.flowContainer, ComicsFragment.newInstance())
                .commit()
        }
    }

    companion object {

        fun newInstance(): ComicsFlowFragment = ComicsFlowFragment()
    }
}