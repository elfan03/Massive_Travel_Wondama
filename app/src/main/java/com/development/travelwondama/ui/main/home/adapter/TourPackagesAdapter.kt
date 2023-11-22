package com.development.travelwondama.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemTourPackagesBinding
import com.development.travelwondama.domain.model.TourPackages
import com.development.travelwondama.utils.Converters.toRupiahFormat
import com.development.travelwondama.utils.Extensions
import com.development.travelwondama.utils.Extensions.showImageInto

class TourPackagesAdapter(val data: (TourPackages) -> Unit) : ListAdapter<TourPackages, TourPackagesAdapter.TourPackagesViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourPackagesViewHolder {
        val binding = ItemTourPackagesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TourPackagesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TourPackagesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TourPackagesViewHolder(private val binding: ItemTourPackagesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tourPackages: TourPackages) {
            binding.apply {
                sivCover.showImageInto(itemView.context, tourPackages.imageList[0].imageUrl)
                tvName.text = tourPackages.name
                tvDescription.text = tourPackages.nameDesc
                tvPrice.text = toRupiahFormat(tourPackages.price)
                btnDetail.setOnClickListener { data.invoke(tourPackages) }
                btnBooking.setOnClickListener {
                    val number = "+6282347859821"
                    val message = "Halo, Saya ingin memesan ${tourPackages.name}"
                    Extensions.openWhatsAppChat(itemView.context, number, message)
                }
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<TourPackages>() {
            override fun areItemsTheSame(oldItem: TourPackages, newItem: TourPackages): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: TourPackages, newItem: TourPackages): Boolean =
                oldItem == newItem
        }
    }
}