package com.development.travelwondama.ui.main.home.strategic.first.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.development.travelwondama.ui.main.home.strategic.bahari.BahariFragment
import com.development.travelwondama.ui.main.home.strategic.culture.TourismCulture
import com.development.travelwondama.ui.main.home.strategic.history.HistoryFragment

class StrategicPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null

        when (position) {
            0 -> fragment = TourismCulture()
            1 -> fragment = BahariFragment()
            2 -> fragment = HistoryFragment()
        }

        return fragment as Fragment
    }
}