package com.app.systemtask.nikhil.kotlinscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.systemtask.R
import com.app.systemtask.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
}