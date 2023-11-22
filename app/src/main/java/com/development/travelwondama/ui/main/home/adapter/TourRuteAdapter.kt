package com.development.travelwondama.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.R
import com.development.travelwondama.databinding.ItemTourRuteBinding
import com.development.travelwondama.domain.model.TourRute

class TourRuteAdapter : ListAdapter<TourRute, TourRuteAdapter.TourRuteViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourRuteViewHolder {
        val binding = ItemTourRuteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourRuteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TourRuteViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TourRuteViewHolder(private val binding: ItemTourRuteBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tourRute: TourRute) {
            binding.tvSpecifics.text = itemView.context.getString(R.string.bullet_text, tourRute.id, tourRute.location)
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TourRute>() {
            override fun areItemsTheSame(oldItem: TourRute, newItem: TourRute): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: TourRute, newItem: TourRute): Boolean =
                oldItem == newItem
        }
    }
}