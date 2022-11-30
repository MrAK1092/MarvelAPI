package ui.comics.comics

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFragment
import com.example.marvelapi.databinding.ActivityMainBinding.bind
import com.example.marvelapi.databinding.FragmentComicsBinding

class ComicsFragment : BaseFragment(R.layout.fragment_comics) {

    private val binding by viewBinding(FragmentComicsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

        fun newInstance(): ComicsFragment = ComicsFragment()
    }
}