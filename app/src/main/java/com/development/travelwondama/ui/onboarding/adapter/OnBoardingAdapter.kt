package com.development.travelwondama.ui.onboarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.development.travelwondama.databinding.ItemOnboardingBinding
import com.development.travelwondama.domain.model.OnBoarding

class OnBoardingAdapter : ListAdapter<OnBoarding, OnBoardingAdapter.OnBoardingViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        val binding = ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  OnBoardingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class OnBoardingViewHolder(private val binding: ItemOnboardingBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(onBoarding: OnBoarding) {
            binding.apply {
                ivBackground.setImageResource(onBoarding.image)
            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<OnBoarding>() {
            override fun areItemsTheSame(oldItem: OnBoarding, newItem: OnBoarding): Boolean =
                oldItem == newItem

            override fun areContentsTheSame(oldItem: OnBoarding, newItem: OnBoarding): Boolean =
                oldItem == newItem
        }
    }
}