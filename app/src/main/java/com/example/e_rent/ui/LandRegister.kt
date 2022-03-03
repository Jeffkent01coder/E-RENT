package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityLandRegisterBinding

class LandRegister : AppCompatActivity() {
    private lateinit var binding: ActivityLandRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLandRegisterBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}