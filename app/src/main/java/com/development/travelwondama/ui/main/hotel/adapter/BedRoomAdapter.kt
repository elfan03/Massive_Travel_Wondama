package com.development.travelwondama.ui.main.hotel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemBedroomBinding
import com.development.travelwondama.domain.model.BedRoom
import com.development.travelwondama.utils.Converters.toRupiahFormat
import com.development.travelwondama.utils.Extensions.showImageInto

class BedRoomAdapter(val data: (BedRoom) -> Unit) :
    ListAdapter<BedRoom, BedRoomAdapter.BedRoomViewHolder>(
        DIFF_CALLBACK
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BedRoomViewHolder {
        val binding = ItemBedroomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BedRoomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BedRoomViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class BedRoomViewHolder(val binding: ItemBedroomBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val specificAdapter = SpecificAdapter()

        fun bind(bedRoom: BedRoom) {
            binding.apply {
                tvNameRoom.text = bedRoom.name
                tvPriceDay.text = toRupiahFormat(bedRoom.pricePerNight)
                sivCover.showImageInto(itemView.context, bedRoom.imageList[0].imageUrl)
                rvSpecificBedroom.apply {
                    layoutManager =
                        LinearLayoutManager(itemView.context, LinearLayoutManager.VERTICAL, false)
                    adapter = specificAdapter
                }
                specificAdapter.submitList(bedRoom.specificBedroom)
                btnSelect.setOnClickListener { data.invoke(bedRoom) }
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<BedRoom>() {
            override fun areItemsTheSame(oldItem: BedRoom, newItem: BedRoom) =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: BedRoom, newItem: BedRoom): Boolean =
                oldItem.id == newItem.id
        }
    }
}