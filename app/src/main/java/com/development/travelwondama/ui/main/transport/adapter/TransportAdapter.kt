package com.development.travelwondama.ui.main.transport.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.R
import com.development.travelwondama.databinding.ItemTransportBinding
import com.development.travelwondama.domain.model.Transport
import com.development.travelwondama.utils.Extensions.showImageInto

class TransportAdapter : ListAdapter<Transport, TransportAdapter.TransportViewHolder>(DIFF_CALLBACK) {

    inner class TransportViewHolder(val binding: ItemTransportBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(transport: Transport) {
            binding.apply {
                sivTransport.showImageInto(itemView.context, transport.imageUrl)
                tvName.text = transport.name
                tvGoalsValue.text = itemView.context.getString(R.string.list_value, transport.goal)
                tvDepartureTimeValue.text = itemView.context.getString(R.string.list_value, transport.timeStart)
                tvArriveTimeValue.text = itemView.context.getString(R.string.list_value, transport.timeFinish)
                tvTravelTimeValue.text = itemView.context.getString(R.string.list_value, transport.travelTime)
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Transport>() {
            override fun areItemsTheSame(oldItem: Transport, newItem: Transport): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: Transport, newItem: Transport): Boolean =
                oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportViewHolder {
        val binding = ItemTransportBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TransportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransportViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}