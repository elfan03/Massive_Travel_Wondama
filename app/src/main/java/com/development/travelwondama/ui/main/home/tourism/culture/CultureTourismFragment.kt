package com.development.travelwondama.ui.main.home.tourism.culture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.R
import com.development.travelwondama.data.TourismData
import com.development.travelwondama.databinding.FragmentCultureTourismBinding
import com.development.travelwondama.domain.model.Tourism
import com.development.travelwondama.ui.main.home.adapter.TourismAdapter

class CultureTourismFragment : Fragment() {

    private var _binding: FragmentCultureTourismBinding? = null
    private val binding get() = _binding
    private lateinit var tourismAdapter: TourismAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCultureTourismBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupRecyclerView()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.tour_culture)
            }
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

    private fun setupRecyclerView() {
        val cultureTourismData = TourismData.dummyCultureTourism

        tourismAdapter = TourismAdapter { tourism ->
            navigateToDetailCulture(tourism)
        }

        binding?.rvNatureTourism?.apply {
            layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = tourismAdapter
        }
        tourismAdapter.submitList(cultureTourismData)
    }

    private fun navigateToDetailCulture(tourism: Tourism) {
        val action = CultureTourismFragmentDirections.actionCultureTourismFragmentToDetailCultureTourismFragment(tourism)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}