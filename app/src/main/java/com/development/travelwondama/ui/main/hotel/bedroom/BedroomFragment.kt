package com.development.travelwondama.ui.main.hotel.bedroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.Pair
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentBedroomBinding
import com.development.travelwondama.domain.model.BedRoom
import com.development.travelwondama.domain.model.Hotel
import com.development.travelwondama.ui.main.hotel.adapter.FacilitiesAdapter
import com.development.travelwondama.ui.main.hotel.adapter.SpecificAdapter
import com.development.travelwondama.utils.Converters
import com.development.travelwondama.utils.Extensions.showImageInto
import com.google.android.material.datepicker.MaterialDatePicker

class BedroomFragment : Fragment() {

    private var _binding: FragmentBedroomBinding? = null
    private val binding get() = _binding
    private val navArgs: BedroomFragmentArgs by navArgs()
    private lateinit var specificsDetailAdapter: SpecificAdapter
    private lateinit var facilitiesAdapter: FacilitiesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBedroomBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val bedroomArgs = navArgs.bedroom

        binding?.apply {
            contentDetailBedroom.apply {
                ivCover.showImageInto(requireActivity(), bedroomArgs.imageList[0].imageUrl)
                contentMoreDetail.apply {
                    tvPriceNightValue.text = Converters.toRupiahFormat(bedroomArgs.pricePerNight)
                }
                imageListHotel.apply {
                    if (bedroomArgs.imageList.isNotEmpty()) {
                        val imageMore = bedroomArgs.imageList.size - 2

                        ivFirstImage.showImageInto(
                            requireActivity(),
                            bedroomArgs.imageList[0].imageUrl
                        )
                        ivSecondImage.showImageInto(
                            requireActivity(),
                            bedroomArgs.imageList[1].imageUrl
                        )
                        ivThirdImage.showImageInto(
                            requireActivity(),
                            bedroomArgs.imageList[2].imageUrl
                        )
                        tvImageMore.text =
                            getString(R.string.picture_more, imageMore.toString())
                    }
                }

                setupToolbar(bedroomArgs.name)
                setupRecyclerFacilities(bedroomArgs)
                setupRecyclerSpecifics(bedroomArgs)
                setDateStay()
            }
        }
    }

    private fun setupToolbar(name: String) {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = name
            }
        }

        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {

            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                findNavController().navigateUp()
                return true
            }

        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

    private fun setupRecyclerSpecifics(bedRoom: BedRoom) {
        specificsDetailAdapter = SpecificAdapter()

        binding?.contentDetailBedroom?.rvBedroom?.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = specificsDetailAdapter
            setHasFixedSize(true)
        }
        specificsDetailAdapter.submitList(bedRoom.specificBedroom)
    }

    private fun setupRecyclerFacilities(bedRoom: BedRoom) {
        facilitiesAdapter = FacilitiesAdapter()

        binding?.contentDetailBedroom?.rvFacilities?.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
            adapter = facilitiesAdapter
            setHasFixedSize(true)
        }
        facilitiesAdapter.submitList(bedRoom.facilities)
    }

    private fun setDateStay() {
        binding?.contentDetailBedroom?.contentMoreDetail?.apply {
            cardChooseDate.cardView.apply {
                visibility = View.VISIBLE
                setOnClickListener { setUpDateRangePicker() }
            }
        }
    }

    private fun setUpDateRangePicker() {
        val hotelArgs = navArgs.hotel
        val bedroomArgs = navArgs.bedroom

        val dateRangePicker = MaterialDatePicker.Builder
            .dateRangePicker()
            .setTheme(R.style.ThemeMaterialCalendar)
            .setTitleText(getString(R.string.choose_date))
            .setSelection(Pair(null, null))
            .build()

        dateRangePicker.show(
            childFragmentManager,
            "DateRangePicker"
        )

        dateRangePicker.addOnPositiveButtonClickListener { datePicked ->
            val startDate = Converters.longToDateDayWithMonth(datePicked.first)
            val endDate = Converters.longToDateDayWithMonth(datePicked.second)

            binding?.apply {
                btnSelectBedroom.isEnabled = (datePicked.first != null && datePicked.second != null)
                btnSelectBedroom.setOnClickListener {
                    navigateToBookingBedroom(startDate, endDate, hotelArgs, bedroomArgs)
                }
                contentDetailBedroom.contentMoreDetail.apply {
                    tvCheckInValue.text = startDate
                    tvCheckOutValue.text = endDate
                    cardChooseDate.cardView.visibility = View.GONE
                }
            }
        }
    }

    private fun navigateToBookingBedroom(startDate: String, endDate: String, hotelArgs: Hotel, bedroomArgs: BedRoom) {
        val action =
            BedroomFragmentDirections.actionBedroomFragmentToBookingFragment(
                startDate,
                endDate,
                hotelArgs,
                bedroomArgs
            )
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}