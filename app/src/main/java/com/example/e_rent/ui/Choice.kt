package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityChoiceBinding

class Choice : AppCompatActivity() {
    private lateinit var binding: ActivityChoiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}