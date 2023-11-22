package com.development.travelwondama.ui.main.home.tourism.packages

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
import com.development.travelwondama.databinding.FragmentDetailTourPackagesBinding
import com.development.travelwondama.domain.model.TourPackages
import com.development.travelwondama.ui.main.home.adapter.TourRuteAdapter
import com.development.travelwondama.utils.Converters
import com.development.travelwondama.utils.Converters.toRupiahFormat
import com.development.travelwondama.utils.Extensions.openWhatsAppChat
import com.development.travelwondama.utils.Extensions.showImageInto
import com.google.android.material.datepicker.MaterialDatePicker

class DetailTourPackagesFragment : Fragment() {

    private var _binding: FragmentDetailTourPackagesBinding? = null
    private val binding get() = _binding
    private val navArgs: DetailTourPackagesFragmentArgs by navArgs()
    private lateinit var tourRuteAdapter: TourRuteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailTourPackagesBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val tourPackagesArgs = navArgs.tourPackages

        binding?.apply {
            contentDetailTourPackages.apply {
                contentImageDetail.apply {
                    val imageMore = tourPackagesArgs.imageList.size - 2

                    ivFirstImage.showImageInto(
                        requireActivity(),
                        tourPackagesArgs.imageList[0].imageUrl
                    )
                    ivSecondImage.showImageInto(
                        requireActivity(),
                        tourPackagesArgs.imageList[1].imageUrl
                    )
                    ivThirdImage.showImageInto(
                        requireActivity(),
                        tourPackagesArgs.imageList[2].imageUrl
                    )
                    tvImageMore.text = getString(R.string.picture_more, imageMore.toString())
                }
                tvName.text = tourPackagesArgs.nameDesc
                cardChooseDate.cardView.setOnClickListener { setupDateRangePicker(tourPackagesArgs) }
                contentSpecifics.apply {
                    tvPriceValue.text = toRupiahFormat(tourPackagesArgs.price)
                    tvDescription.text = tourPackagesArgs.description
                }
            }
        }

        setupToolbar(tourPackagesArgs)
        setupRecyclerView(tourPackagesArgs)
    }

    private fun setupToolbar(tourPackages: TourPackages) {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = tourPackages.name
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

    private fun setupRecyclerView(tourPackages: TourPackages) {
        tourRuteAdapter = TourRuteAdapter()

        binding?.contentDetailTourPackages?.contentSpecifics?.rvTouristSpot?.apply {
            layoutManager =
                LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = tourRuteAdapter
        }

        tourRuteAdapter.submitList(tourPackages.activity)
    }

    private fun setupDateRangePicker(tourPackages: TourPackages) {
        val dateRangePicker = MaterialDatePicker.Builder
            .dateRangePicker()
            .setTheme(R.style.ThemeMaterialCalendar)
            .setTitleText(getString(R.string.choose_date))
            .setSelection(Pair(null, null))
            .build()

        dateRangePicker.show(
            requireActivity().supportFragmentManager,
            "DateRangePicker"
        )

        dateRangePicker.addOnPositiveButtonClickListener { datePicked ->
            val startDate = Converters.longToDateDayWithMonth(datePicked.first)
            val endDate = Converters.longToDateDayWithMonth(datePicked.second)

            binding?.apply {
                contentDetailTourPackages.apply {
                    cardChooseDate.tvChooseDate.text =
                        getString(R.string.range_date_value, startDate, endDate)
                }
                btnBooking.isEnabled = (datePicked.first != null && datePicked.second != null)
                btnBooking.setOnClickListener {
                    val number = "+6282347859821"
                    val message =
                        "Halo, Saya ingin memesan ${tourPackages.name} pada tanggal $startDate sampai tanggal $endDate"
                    openWhatsAppChat(requireActivity(), number, message)
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}