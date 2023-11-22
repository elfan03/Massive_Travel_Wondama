package com.development.travelwondama.ui.main.home.strategic.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentStrategicFirstBinding
import com.development.travelwondama.domain.model.Ksp
import com.development.travelwondama.ui.main.home.strategic.first.adapter.StrategicPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class StrategicFirstFragment : Fragment() {

    private var _binding: FragmentStrategicFirstBinding? = null
    private val binding get() = _binding
    private val navArgs by navArgs<StrategicFirstFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStrategicFirstBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val strategicArgs = navArgs.strategic

        setupToolbar(strategicArgs)
        setupViewPager()
    }

    private fun setupToolbar(ksp: Ksp?) {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.title = ksp?.title
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {}

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                findNavController().navigateUp()
                return true
            }
        }, viewLifecycleOwner, Lifecycle.State.CREATED)
    }

    private fun setupViewPager() {
        val strategicPagerAdapter = StrategicPagerAdapter(requireActivity())

        binding?.apply {
            viewPager.adapter = strategicPagerAdapter

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
            R.string.tour_culture,
            R.string.tour_bahari,
            R.string.tour_history
        )
    }
}