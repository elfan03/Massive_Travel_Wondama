package com.development.travelwondama.ui.main.transport.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.development.travelwondama.ui.main.transport.plane.PlaneFragment
import com.development.travelwondama.ui.main.transport.ship.ShipFragment

class SectionPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null

        when(position) {
            0 -> fragment = ShipFragment()
            1 -> fragment = PlaneFragment()
        }

        return fragment as Fragment
    }
}