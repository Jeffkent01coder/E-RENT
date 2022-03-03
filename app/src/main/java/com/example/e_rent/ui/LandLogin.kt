package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityLandLoginBinding

class LandLogin : AppCompatActivity() {
    private lateinit var binding: ActivityLandLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLandLoginBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}