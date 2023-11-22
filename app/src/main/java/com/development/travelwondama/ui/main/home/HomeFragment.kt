package com.development.travelwondama.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.data.FestivalsData
import com.development.travelwondama.data.KspData
import com.development.travelwondama.databinding.FragmentHomeBinding
import com.development.travelwondama.domain.model.Festival
import com.development.travelwondama.domain.model.Ksp
import com.development.travelwondama.ui.main.home.adapter.FestivalAdapter
import com.development.travelwondama.ui.main.home.adapter.StrategicAdapter
import com.development.travelwondama.utils.Extensions.showImageInto

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private lateinit var festivalAdapter: FestivalAdapter
    private lateinit var strategicAdapter: StrategicAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val strategicData = KspData.dummyKsp
        val festivalsData = FestivalsData.dummyFestival

        binding?.contentHome?.apply {
            topBarHome.apply {
                ivProfile.showImageInto(
                    requireActivity(),
                    "https://media.vanityfair.com/photos/5d07ad7476711f48937fe6ed/master/w_1920,c_limit/American-Woman-Miller.jpg"
                )
                ivProfile.setOnClickListener { navigateToProfile() }
                ibNotification.setOnClickListener { navigateToNotification() }
            }
            btnTourNature.setOnClickListener { navigateToNatureTourism() }
            btnTourCulture.setOnClickListener { navigateToCultureTourism() }
            btnTourPacket.setOnClickListener { navigateToTourPackages() }
            btnTourReligious.setOnClickListener { navigateToReligiousTourism() }
        }

        setupRecyclerFestival(festivalsData)
        setupRecyclerStrategic(strategicData)
    }

    private fun setupRecyclerStrategic(ksp: List<Ksp>) {
        strategicAdapter = StrategicAdapter { strategic ->
            navigateToFirstStrategic(strategic)
        }

        binding?.contentHome?.rvKsp?.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            adapter = strategicAdapter
        }

        strategicAdapter.submitList(ksp)
    }

    private fun setupRecyclerFestival(listFestival: List<Festival>) {
        festivalAdapter = FestivalAdapter { festival ->
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFestivalFragment(festival)
            findNavController().navigate(action)
        }

        binding?.contentHome?.rvFestival?.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = festivalAdapter
        }

        festivalAdapter.submitList(listFestival)
    }

    private fun navigateToNatureTourism() {
        val action = HomeFragmentDirections.actionHomeFragmentToNatureTourismFragment()
        findNavController().navigate(action)
    }

    private fun navigateToCultureTourism() {
        val action = HomeFragmentDirections.actionHomeFragmentToCultureTourismFragment()
        findNavController().navigate(action)
    }

    private fun navigateToTourPackages() {
        val action = HomeFragmentDirections.actionHomeFragmentToTourPackagesFragment()
        findNavController().navigate(action)
    }

    private fun navigateToReligiousTourism() {
        val action = HomeFragmentDirections.actionHomeFragmentToReligiousTourismFragment()
        findNavController().navigate(action)
    }

    private fun navigateToProfile() {
        val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment()
        findNavController().navigate(action)
    }

    private fun navigateToNotification() {
        val action = HomeFragmentDirections.actionHomeFragmentToNotificationFragment()
        findNavController().navigate(action)
    }

    private fun navigateToFirstStrategic(ksp: Ksp) {
        val action = HomeFragmentDirections.actionHomeFragmentToStrategicFirstFragment(ksp)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}