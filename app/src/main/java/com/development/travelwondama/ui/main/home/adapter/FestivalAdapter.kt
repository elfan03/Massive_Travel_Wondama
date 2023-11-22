package com.development.travelwondama.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemFestivalBinding
import com.development.travelwondama.domain.model.Festival
import com.development.travelwondama.utils.Extensions.showImageInto

class FestivalAdapter(val data: (Festival) -> Unit) : ListAdapter<Festival, FestivalAdapter.FestivalViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FestivalViewHolder {
        val binding = ItemFestivalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  FestivalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FestivalViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FestivalViewHolder(private val binding: ItemFestivalBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(festival: Festival) {
            binding.apply {
                sivCover.showImageInto(itemView.context, festival.imageUrl)
                tvTitle.text = festival.title
                tvDate.text = festival.date
                tvDescription.text = festival.description
            }
            itemView.setOnClickListener { data.invoke(festival) }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Festival>() {
            override fun areItemsTheSame(oldItem: Festival, newItem: Festival): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Festival, newItem: Festival): Boolean =
                oldItem.id == newItem.id
        }
    }
}