package com.development.travelwondama.ui.main.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.R
import com.development.travelwondama.data.HotelsData
import com.development.travelwondama.databinding.FragmentHotelBinding
import com.development.travelwondama.ui.main.hotel.adapter.HotelAdapter

class HotelFragment : Fragment() {

    private var _binding: FragmentHotelBinding? = null
    private val binding get() = _binding
    private lateinit var hotelAdapter: HotelAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHotelBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupRecyclerView()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.contentHotel?.toolbar)
            supportActionBar?.title = getString(R.string.hotel_homestay)
        }
    }

    private fun setupRecyclerView() {
        val dummyHotel = HotelsData.dummyHotels

        hotelAdapter = HotelAdapter {  hotel ->
            val action = HotelFragmentDirections.actionHotelFragmentToDetailHotelFragment(hotel)
            findNavController().navigate(action)
        }
        binding?.contentHotel?.rvNatureTourism?.apply {
            layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = hotelAdapter
        }

        hotelAdapter.submitList(dummyHotel)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}