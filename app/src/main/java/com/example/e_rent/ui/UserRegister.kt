package com.example.e_rent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.e_rent.databinding.ActivityUserRegisterBinding

class UserRegister : AppCompatActivity() {
    private lateinit var binding: ActivityUserRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserRegisterBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}