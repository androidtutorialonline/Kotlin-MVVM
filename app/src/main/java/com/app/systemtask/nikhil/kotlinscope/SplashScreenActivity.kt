package com.app.systemtask.nikhil.kotlinscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.systemtask.R
import com.app.systemtask.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
}