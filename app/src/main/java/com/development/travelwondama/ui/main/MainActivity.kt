package com.development.travelwondama.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.development.travelwondama.R
import com.development.travelwondama.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, navDestination, _ ->
            Handler(Looper.getMainLooper()).post {
                when (navDestination.id) {
                    R.id.homeFragment, R.id.hotelFragment, R.id.mapsFragment, R.id.transportFragment -> {
                        binding.bottomNavigation.visibility = View.VISIBLE
                    }
                    else -> {
                        binding.bottomNavigation.visibility = View.GONE
                    }
                }
            }
        }

        binding.bottomNavigation.setupWithNavController(navController)
    }
}