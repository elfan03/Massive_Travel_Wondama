package com.development.travelwondama.ui.main.hotel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemFacilitiesBinding
import com.development.travelwondama.domain.model.Facilities

class FacilitiesAdapter : ListAdapter<Facilities, FacilitiesAdapter.FacilitiesViewHolder>(
    DIFF_CALLBACK
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilitiesViewHolder {
        val binding = ItemFacilitiesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FacilitiesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FacilitiesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FacilitiesViewHolder(val binding: ItemFacilitiesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(facilities: Facilities) {
            binding.tvFacilities.apply {
                text = facilities.facility
                setCompoundDrawablesWithIntrinsicBounds(0, facilities.icon, 0, 0)
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Facilities>() {
            override fun areItemsTheSame(oldItem: Facilities, newItem: Facilities) =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Facilities, newItem: Facilities): Boolean =
                oldItem.id == newItem.id
        }
    }
}