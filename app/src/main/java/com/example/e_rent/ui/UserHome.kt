package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityUserHomeBinding

class UserHome : AppCompatActivity() {
    private lateinit var binding: ActivityUserHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}