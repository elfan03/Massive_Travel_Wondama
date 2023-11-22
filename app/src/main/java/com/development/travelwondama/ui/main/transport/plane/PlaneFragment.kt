package com.development.travelwondama.ui.main.transport.plane

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.development.travelwondama.data.TransportsData
import com.development.travelwondama.databinding.FragmentPlaneBinding
import com.development.travelwondama.ui.main.transport.adapter.TransportAdapter

class PlaneFragment : Fragment() {

    private var _binding: FragmentPlaneBinding? = null
    private val binding get() = _binding
    private lateinit var transportAdapter: TransportAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlaneBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView()
    }

    private fun setupView() {
        val dummyPlane = TransportsData.dummyPlane
        transportAdapter = TransportAdapter()

        binding?.rvPlane?.apply {
            layoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
            adapter = transportAdapter
        }

        transportAdapter.submitList(dummyPlane)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}