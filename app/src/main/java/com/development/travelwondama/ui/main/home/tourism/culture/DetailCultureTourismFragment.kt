package com.development.travelwondama.ui.main.home.tourism.culture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.development.travelwondama.R
import com.development.travelwondama.databinding.FragmentDetailCultrureTourismBinding
import com.development.travelwondama.domain.model.Tourism
import com.development.travelwondama.utils.Extensions.showImageInto

class DetailCultureTourismFragment : Fragment() {

    private var _binding: FragmentDetailCultrureTourismBinding? = null
    private val binding get() = _binding
    private val navArgs: DetailCultureTourismFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailCultrureTourismBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val tourismArgs = navArgs.tourism

        binding?.contentDetail?.contentDetailNature?.apply {
            contentImageDetail.apply {
                val imageMore = tourismArgs.imageList.size - 2

                ivFirstImage.showImageInto(requireActivity(), tourismArgs.imageList[0].imageUrl)
                ivSecondImage.showImageInto(requireActivity(), tourismArgs.imageList[1].imageUrl)
                ivThirdImage.showImageInto(requireActivity(), tourismArgs.imageList[2].imageUrl)
                tvImageMore.text = getString(R.string.picture_more, imageMore.toString())
            }
            tvName.text = tourismArgs.name
            tvAddress.visibility = View.GONE
            tvDescription.text = tourismArgs.description
        }

        setupToolbar(tourismArgs)
    }

    private fun setupToolbar(tourism: Tourism) {
        (activity as AppCompatActivity).apply {
            setSupportActionBar(binding?.contentDetail?.toolbar)
            supportActionBar?.apply {
                setDisplayHomeAsUpEnabled(true)
                title = tourism.name
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