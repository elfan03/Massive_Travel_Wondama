package com.development.travelwondama.ui.main.hotel.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentBookingBinding
import com.development.travelwondama.utils.Converters
import com.development.travelwondama.utils.Extensions
import com.development.travelwondama.utils.Extensions.showImageInto

class BookingFragment : Fragment() {

    private var _binding: FragmentBookingBinding? = null
    private val binding get() = _binding
    private val navArgs: BookingFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBookingBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
        setupToolbar()
    }

    private fun setupView() {
        val hotelArgs = navArgs.hotel
        val bedroomArgs = navArgs.bedroom
        val startDateArgs = navArgs.startDate
        val endDateArgs = navArgs.endDate
        val adminPay = 0
        val total = bedroomArgs.pricePerNight + adminPay

        val textPrice = Converters.toRupiahFormat(bedroomArgs.pricePerNight)
        val textAdmin = Converters.toRupiahFormat(adminPay)
        val totalPrice = Converters.toRupiahFormat(total)

        binding?.apply {
            tvTotalBooking.text = Converters.toRupiahFormat(total)

            contentBookingBedroom.apply {
                ivCover.showImageInto(requireActivity(), hotelArgs.imageCover)
                tvName.text = hotelArgs.name
                rbHotel.rating = hotelArgs.rating.toFloat()
                tvReview.text = getString(R.string.review_value, hotelArgs.totalReview.toString())
                tvAddress.text = hotelArgs.address

                contentSpecificsBedroom.apply {
                    tvCheckInValue.text = startDateArgs
                    tvCheckOutValue.text = endDateArgs
                    tvBedroomValue.text = bedroomArgs.name
                    bedroomArgs.facilities.forEach {
                        tvFacilitiesValue.append(" ${it.facility} • ")
                    }
                }
                contentPriceBedroom.apply {
                    tvPriceBedroomValue.text = textPrice
                    tvPriceAdminValue.text = textAdmin
                    tvTotalPrice.text = totalPrice
                }

                btnBooking.setOnClickListener {
                    val nameCustomer =
                        contentBookingBedroom.contentContactsBooking.tilName.editText?.text.toString()
                            .trim()
                    val numberCustomer =
                        contentBookingBedroom.contentContactsBooking.tilNumberTelephone.editText?.text.toString()
                            .trim()
                    val emailCustomer =
                        contentBookingBedroom.contentContactsBooking.tilEmail.editText?.text.toString()
                            .trim()

                    if (nameCustomer.isNotEmpty() && numberCustomer.isNotEmpty() && emailCustomer.isNotEmpty()) {
                        val number = "+6282347859821"
                        val message =
                            "Halo, Perkenalkan.\nNama : $nameCustomer\nNomor : $numberCustomer\nEmail : $emailCustomer\nSaya ingin memesan ${hotelArgs.name} kamar ${bedroomArgs.name} pada tanggal $startDateArgs sampai tanggal $endDateArgs"
                        Extensions.openWhatsAppChat(requireActivity(), number, message)
                    } else {
                        Toast.makeText(
                            requireActivity(),
                            "Silahkan isi data diri terlebih dahulu",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = getString(R.string.booking)
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}