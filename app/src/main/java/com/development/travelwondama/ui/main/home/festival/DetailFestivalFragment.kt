package com.development.travelwondama.ui.main.home.festival

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
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.databinding.FragmentDetailFestivalBinding
import com.development.travelwondama.domain.model.Festival
import com.development.travelwondama.utils.Extensions.showImageInto

class DetailFestivalFragment : Fragment() {

    private var _binding: FragmentDetailFestivalBinding? = null
    private val binding get() = _binding
    private val navArgs: DetailFestivalFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailFestivalBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val festivalArgs = navArgs.festival

        binding?.contentDetailFestival?.apply {
            ivCover.showImageInto(requireActivity(), festivalArgs.imageUrl)
            tvTitle.text = festivalArgs.title
            tvDate.text = festivalArgs.date
            tvDescription.text = festivalArgs.description
        }
        setupToolbar(festivalArgs)
    }

    private fun setupToolbar(festival: Festival) {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = festival.title
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