package com.development.travelwondama.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.development.travelwondama.ui.auth.AuthActivity
import com.development.travelwondama.ui.onboarding.OnBoardingActivity

class RoutingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)

        splashScreen.setKeepOnScreenCondition{ true }

        val onBoarding = this.getSharedPreferences("onBoarding", MODE_PRIVATE)
        val isFirstTime = onBoarding.getBoolean("First Time", true)
        val editor = onBoarding.edit()

        if (isFirstTime) {
            editor.apply {
                putBoolean("First Time", false)
                apply()
            }

            val intent = Intent(this@RoutingActivity, OnBoardingActivity::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(this@RoutingActivity, AuthActivity::class.java)
            startActivity(intent)
        }
    }
}