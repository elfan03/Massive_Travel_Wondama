package com.development.travelwondama.ui.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemStrategicBinding
import com.development.travelwondama.domain.model.Ksp
import com.development.travelwondama.utils.Extensions.showImageInto

class StrategicAdapter(val data: (Ksp) -> Unit) : ListAdapter<Ksp, StrategicAdapter.StrategicViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategicViewHolder {
        val binding = ItemStrategicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StrategicViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StrategicViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class StrategicViewHolder(private val binding: ItemStrategicBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(ksp: Ksp) {
            binding.apply {
                sivKsp.showImageInto(itemView.context, ksp.imageUrl)
                tvTitle.text = ksp.title
                tvLocation.text = ksp.place
                ksp.category.forEach { tvCategory.append("• $it ") }
            }

            itemView.setOnClickListener { data.invoke(ksp) }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Ksp>() {
            override fun areItemsTheSame(oldItem: Ksp, newItem: Ksp) = oldItem == newItem

            override fun areContentsTheSame(oldItem: Ksp, newItem: Ksp) = oldItem == newItem
        }
    }
}