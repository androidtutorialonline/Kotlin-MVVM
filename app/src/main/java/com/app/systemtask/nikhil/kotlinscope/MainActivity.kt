package com.app.systemtask.nikhil.kotlinscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.systemtask.databinding.ActivityMain3Binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    private  var movielist:List<MovieModel>? = null
    private lateinit var rvAdapter: Movieadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        loadLanguage()

        rvAdapter= movielist?.let { Movieadapter(it,this) }!!
        binding.rvRecylerview.adapter=rvAdapter
        binding.rvRecylerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)
    }

    private fun loadLanguage() {
        movielist = listOf(
            MovieModel("Java" , "Exp : 3 years","2021"),
            MovieModel("Kotlin" , "Exp : 2 years","2021"),
            MovieModel("Python" , "Exp : 4 years","2021"),
            MovieModel("JavaScript" , "Exp : 6 years","2021"),
            MovieModel("PHP" , "Exp : 1 years","2021"),
            MovieModel("CPP" , "Exp : 8 years","2021"),
        )
    }
}