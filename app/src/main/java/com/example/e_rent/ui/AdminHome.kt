package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityAdminHomeBinding

class AdminHome : AppCompatActivity() {
    private lateinit var binding: ActivityAdminHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAdminHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}