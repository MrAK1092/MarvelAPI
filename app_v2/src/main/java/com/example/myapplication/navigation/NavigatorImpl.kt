package com.example.myapplication.navigation

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NavigatorImpl(
        private val fragmentManager: FragmentManager,
        private val containerId: Int
) : Navigator {

    override fun startNewFlow(fragment: Fragment) {
        fragmentManager.popBackStackImmediate()

        val transaction = fragmentManager.beginTransaction()

        val otherFlowFragment: Fragment? = if (fragmentManager.fragments.isNotEmpty()) {
            fragmentManager.fragments.first { it.isVisible }
        } else null

        if (otherFlowFragment != null) transaction.remove(otherFlowFragment)

        transaction.add(containerId, fragment)
        transaction.show(fragment)
        transaction.commit()
    }

    override fun replaceFlowFragment(fragment: Fragment) {
        val transaction = fragmentManager.beginTransaction()

        val otherFlowFragment: Fragment? = if (fragmentManager.fragments.isNotEmpty()) {
            fragmentManager.fragments.first { it.isVisible }
        } else null

        if (otherFlowFragment != null) transaction.hide(otherFlowFragment)

        if (!fragment.isAdded) {
            transaction.add(containerId, fragment)
            transaction.addToBackStack(null)
        }

        transaction.show(fragment)
        transaction.commit()
    }

    override fun fragmentReplace(fragment: Fragment) {
        fragmentManager
                .beginTransaction()
                .replace(containerId, fragment)
                .commit()
    }

    override fun fragmentReplaceWithBackStack(fragment: Fragment) {
        fragmentManager
                .beginTransaction()
                .replace(containerId, fragment)
                .addToBackStack(null)
                .commit()
    }

    override fun fragmentAdd(
            fragment: Fragment,
            withBackStack: Boolean,
            withClearBackStack: Boolean,
            withAnimation: Boolean
    ) {
        if (withClearBackStack) fragmentManager.popBackStackImmediate()

        val transaction = fragmentManager.beginTransaction()

        if (withAnimation) transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

        transaction.add(containerId, fragment, fragment.toString())
        transaction.show(fragment)

        if (withBackStack) transaction.addToBackStack(null)

        transaction.commit()
    }

    override fun showBottomSheetDialogFragment(fragment: BottomSheetDialogFragment, tag: String) {
        fragment.show(fragmentManager, tag)
    }

    override fun showDialogFragment(fragment: DialogFragment, tag: String) {
        fragment.show(fragmentManager, tag)
    }

    override fun popBack() {
        if (fragmentManager.fragments.isNotEmpty()) {
            fragmentManager.fragments[0]?.requireActivity()?.onBackPressed()
        }
    }

    override fun clearBackStack() {
        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }
}