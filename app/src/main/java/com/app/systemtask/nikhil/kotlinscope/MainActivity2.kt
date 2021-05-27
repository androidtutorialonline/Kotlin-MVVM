package com.app.systemtask.nikhil.kotlinscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.systemtask.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        intent.extras.let {
            binding.tvName.text=it!!.getString("name")
        }
    }
}