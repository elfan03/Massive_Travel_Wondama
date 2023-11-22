package com.development.travelwondama.ui.main.hotel.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentDetailHotelBinding
import com.development.travelwondama.domain.model.Hotel
import com.development.travelwondama.ui.main.hotel.adapter.BedRoomAdapter
import com.development.travelwondama.utils.Extensions.showImageInto

class DetailHotelFragment : Fragment() {

    private var _binding: FragmentDetailHotelBinding? = null
    private val binding get() = _binding
    private lateinit var bedRoomAdapter: BedRoomAdapter
    private val navArgs: DetailHotelFragmentArgs by navArgs()
    private var menuDetail: Menu? = null
    private var statusFavorite: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailHotelBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()
        setupView()
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.contentDetailHotel?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                setHomeAsUpIndicator(ContextCompat.getDrawable(requireActivity(), R.drawable.baseline_arrow_back))
                setDisplayShowTitleEnabled(false)
            }
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.menu_detail, menu)
                menuDetail = menu
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {
                    R.id.btn_favorite -> {
                        statusFavorite = !statusFavorite
                        setIsFavorite(statusFavorite)
                        true
                    }

                    android.R.id.home -> {
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                        true
                    }

                    else -> false
                }
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

    private fun setIsFavorite(favorite: Boolean) {
        if (menuDetail == null) return
        val menuItem = menuDetail?.findItem(R.id.btn_favorite)
        if (favorite) {
            menuItem?.icon =
                ContextCompat.getDrawable(requireActivity(), R.drawable.filled_favorite)
        } else {
            menuItem?.icon =
                ContextCompat.getDrawable(requireActivity(), R.drawable.outline_favorite)
        }
    }

    private fun setupView() {
        val hotel = navArgs.hotel

        binding?.apply {
            contentDetailHotel.apply {
                ivCover.showImageInto(requireActivity(), hotel.imageCover)
                tvName.text = hotel.name
                rbDetailHotel.rating = hotel.rating.toFloat()
                tvDetailReview.text = getString(R.string.review_value, hotel.totalReview.toString())
                tvAboutHotelValue.text = hotel.slogan
                tvAddressHotelValue.text = hotel.address
            }
        }
        setUpRecyclerView(hotel)
    }

    private fun setUpRecyclerView(hotel: Hotel) {

        bedRoomAdapter = BedRoomAdapter { bedRoom ->
            val action = DetailHotelFragmentDirections.actionDetailHotelFragmentToBedroomFragment(bedRoom, hotel)
            findNavController().navigate(action)
        }

        binding?.contentDetailHotel?.rvBedroom?.apply {
            layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = bedRoomAdapter
        }

        bedRoomAdapter.submitList(hotel.bedRoom)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}