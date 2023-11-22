package com.development.travelwondama.ui.main.transport

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentTransportBinding
import com.development.travelwondama.ui.main.transport.adapter.SectionPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class TransportFragment : Fragment() {

    private var _binding: FragmentTransportBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTransportBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupViewPager()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.title = getString(R.string.transport)
        }
    }

    private fun setupViewPager() {
        val sectionAdapter = SectionPagerAdapter(requireActivity())

        binding?.apply {
            viewPager.adapter = sectionAdapter

            TabLayoutMediator(tabs, viewPager) { tab, position ->
                tab.text = resources.getString(TAB_TITLES[position])
            }.attach()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.ship,
            R.string.plane

        )
    }
}