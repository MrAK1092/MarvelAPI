package ui.comics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marvelapi.R
import com.example.marvelapi._commons.base_fragments.BaseFlowFragment
import ui.comics.comics.ComicsFragment

class ComicsFlowFragment: BaseFlowFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null){
            childFragmentManager
                .beginTransaction()
                .replace(R.id.flowContainer, ComicsFragment.newInstance())
                .commit()
        }
    }

    companion object{
        fun newInstance(): ComicsFlowFragment = ComicsFlowFragment()
    }
}