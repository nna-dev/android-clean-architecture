package com.nna.architecture.presentation

import android.os.Bundle
import androidx.core.content.ContextCompat
import com.nna.architecture.presentation.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
        initInsets(binding.root)
    }
}