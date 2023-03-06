package com.example.marvelapi.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marvelapi.R
import com.example.marvelapi.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val facts = resources.getStringArray(R.array.facts)
        fun randomFact(){
            val random = arrayOf(facts)
            val rand = random.random()

            println(random)

        }
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }



    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.navigation_graph
        )

        navigation_graph.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = childFragmentManager,
            containerId = R.id.charHostFragment,
            intent = requireActivity().intent
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}