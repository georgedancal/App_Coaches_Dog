package com.example.appcoachesdog.view.ui.activities.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.appcoachesdog.R
import com.example.appcoachesdog.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    lateinit var binding : ActivitySplashBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.setAnimation(R.raw.dog)
        binding.animationView.playAnimation()

        handler= Handler(Looper.myLooper()!!)

        handler.postDelayed({
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },7000)
    }
}