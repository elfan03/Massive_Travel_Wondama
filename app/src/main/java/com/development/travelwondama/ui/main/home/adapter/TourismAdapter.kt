package com.development.travelwondama.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.R
import com.development.travelwondama.databinding.ItemTourBinding
import com.development.travelwondama.domain.model.Tourism
import com.development.travelwondama.utils.Extensions.showImageInto

class TourismAdapter(val data: (Tourism) -> Unit) : ListAdapter<Tourism, TourismAdapter.TourismViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourismViewHolder {
        val binding = ItemTourBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourismViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TourismViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TourismViewHolder(private val binding: ItemTourBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tourism: Tourism) {
            binding.apply {
                tvName.text = tourism.name
                tvDescription.text = tourism.description
                tvReview.text = itemView.context.getString(R.string.review_value, tourism.totalReview.toString())
                sivCover.showImageInto(itemView.context, tourism.imageUrl)
                rbTour.rating = tourism.rating.toFloat()
                btnDetail.setOnClickListener { data.invoke(tourism) }
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Tourism>() {
            override fun areItemsTheSame(oldItem: Tourism, newItem: Tourism): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Tourism, newItem: Tourism): Boolean =
                oldItem.id == newItem.id
        }
    }
}