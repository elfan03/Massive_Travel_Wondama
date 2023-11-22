package com.development.travelwondama.ui.main.hotel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemSpecificsBedroomBinding
import com.development.travelwondama.domain.model.SpecificBedroom

class SpecificAdapter : ListAdapter<SpecificBedroom, SpecificAdapter.SpecificViewHolder>(
    DIFF_CALLBACK
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecificViewHolder {
        val binding =
            ItemSpecificsBedroomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SpecificViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpecificViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SpecificViewHolder(val binding: ItemSpecificsBedroomBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(specificBedroom: SpecificBedroom) {
            val icon = ContextCompat.getDrawable(itemView.context, specificBedroom.icon)
            icon?.setBounds(0, 0, 48, 48)

            binding.tvSpecifics.apply {
                text = specificBedroom.specific
                setCompoundDrawables(icon, null, null, null)
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SpecificBedroom>() {
            override fun areItemsTheSame(oldItem: SpecificBedroom, newItem: SpecificBedroom) =
                oldItem == newItem

            override fun areContentsTheSame(
                oldItem: SpecificBedroom,
                newItem: SpecificBedroom
            ): Boolean =
                oldItem.specific == newItem.specific
        }
    }
}