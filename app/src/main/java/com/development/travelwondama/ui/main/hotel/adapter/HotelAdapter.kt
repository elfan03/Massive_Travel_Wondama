package com.development.travelwondama.ui.main.hotel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.R
import com.development.travelwondama.databinding.ItemHotelBinding
import com.development.travelwondama.domain.model.Hotel
import com.development.travelwondama.utils.Extensions.showImageInto

class HotelAdapter(val data: (Hotel) -> Unit) : ListAdapter<Hotel, HotelAdapter.SearchViewHolder>(
    DIFF_CALLBACK
)  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val binding = ItemHotelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SearchViewHolder(private val binding: ItemHotelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(hotel: Hotel) {
            binding.apply {
                sivHotel.showImageInto(itemView.context, hotel.imageCover)
                tvName.text = hotel.name
                tvReview.text = itemView.context.getString(R.string.review_value, hotel.totalReview.toString())
                tvSlogan.text = hotel.slogan
                rbHotel.rating = hotel.rating.toFloat()
                btnDetail.setOnClickListener { data.invoke(hotel) }
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Hotel>() {
            override fun areItemsTheSame(oldItem: Hotel, newItem: Hotel) =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Hotel, newItem: Hotel): Boolean =
                oldItem == newItem
        }
    }
}