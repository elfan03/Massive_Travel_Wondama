package com.development.travelwondama.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.development.travelwondama.R
import com.development.travelwondama.data.OnBoardingData
import com.development.travelwondama.databinding.ActivityOnBoardingBinding
import com.development.travelwondama.domain.model.OnBoarding
import com.development.travelwondama.ui.auth.AuthActivity
import com.development.travelwondama.ui.onboarding.adapter.OnBoardingAdapter
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    private lateinit var onBoardingAdapter: OnBoardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
    }

    private fun setupView() {
        val onBoardingData = OnBoardingData.onBoardingData
        setupViewPager(onBoardingData)

        onBoardingAdapter = OnBoardingAdapter()

        binding.apply {
            viewPager2.adapter = onBoardingAdapter

            TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            }.attach()
        }
        onBoardingAdapter.submitList(onBoardingData)
    }

    private fun setupViewPager(onBoarding: List<OnBoarding>) {
        binding.apply {
            viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)

                    when (position) {
                        0 -> {
                            tvTitle.text = onBoarding[0].title
                            tvDescription.text = onBoarding[0].description
                            btnControl.apply {
                                text = getString(R.string.next)
                                setOnClickListener {
                                    viewPager2.currentItem++
                                }
                            }
                        }

                        1 -> {
                            tvTitle.text = onBoarding[1].title
                            tvDescription.text = onBoarding[1].description
                            btnControl.apply {
                                text = getString(R.string.next)
                                setOnClickListener {
                                    viewPager2.currentItem++
                                }
                            }
                        }

                        else -> {
                            tvTitle.text = onBoarding[2].title
                            tvDescription.text = onBoarding[2].description
                            btnControl.apply {
                                text = getString(R.string.start)
                                setOnClickListener {
                                    startActivity(
                                        Intent(
                                            this@OnBoardingActivity,
                                            AuthActivity::class.java
                                        )
                                    )
                                    finish()
                                }
                            }
                        }
                    }
                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.viewPager2.unregisterOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {})
    }
}