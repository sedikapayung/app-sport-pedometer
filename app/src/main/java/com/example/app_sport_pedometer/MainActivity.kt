package com.example.app_sport_pedometer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_sport_pedometer.adapter.ViewPagerAdapter
import com.example.app_sport_pedometer.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        var tablayout = binding.tabLayout
        var viewPager = binding.viewPager

        viewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(tablayout, viewPager){
            tab,position ->
            tab.text = if (position == 0 ) "Login" else "Register"
        }.attach()

    }
}