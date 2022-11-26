package com.example.myapplication.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

interface Navigator {

    fun startNewFlow(fragment: Fragment)

    fun replaceFlowFragment(fragment: Fragment)

    fun fragmentReplace(fragment: Fragment)

    fun fragmentReplaceWithBackStack(fragment: Fragment)

    fun showDialogFragment(fragment: DialogFragment, tag: String)

    fun showBottomSheetDialogFragment(fragment: BottomSheetDialogFragment, tag: String)

    fun fragmentAdd(
        fragment: Fragment,
        withBackStack: Boolean = true,
        withClearBackStack: Boolean = false,
        withAnimation: Boolean = true
    )

    fun popBack()

    fun clearBackStack()
}