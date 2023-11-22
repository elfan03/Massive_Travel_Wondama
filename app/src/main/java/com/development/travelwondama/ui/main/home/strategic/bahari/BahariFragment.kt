package com.development.travelwondama.ui.main.home.strategic.bahari

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.data.KspData
import com.development.travelwondama.databinding.FragmentBahariBinding
import com.development.travelwondama.domain.model.Tourism
import com.development.travelwondama.ui.main.home.adapter.TourismAdapter
import com.development.travelwondama.ui.main.home.strategic.first.StrategicFirstFragmentDirections

class BahariFragment : Fragment() {

    private var _binding: FragmentBahariBinding? = null
    private val binding get() = _binding
    private lateinit var tourismAdapter: TourismAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBahariBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tourismArgs = KspData.dummyKsp[0].tourismBahari

        tourismAdapter = TourismAdapter { tourism ->
            navigateToDetailTourism(tourism)
        }

        binding?.rvTourism?.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = tourismAdapter
        }

        tourismAdapter.submitList(tourismArgs)
    }

    private fun navigateToDetailTourism(tourism: Tourism) {
        val action =
            StrategicFirstFragmentDirections.actionStrategicFirstFragmentToDetailCultureFragment(
                tourism
            )
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}