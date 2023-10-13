package com.alvarogomez.marvelapp.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.marvelapp.databinding.ActivityNavHostBinding

class NavHostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNavHostBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
    }
}