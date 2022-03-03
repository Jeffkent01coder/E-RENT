package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityUserLoginBinding

class UserLogin : AppCompatActivity() {
    private lateinit var binding: ActivityUserLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserLoginBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}