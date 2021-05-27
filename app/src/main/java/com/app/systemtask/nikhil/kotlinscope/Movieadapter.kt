package com.app.systemtask.nikhil.kotlinscope

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.systemtask.databinding.MovieListBinding

class Movieadapter(private var movielist: List<MovieModel>, mainActivity: MainActivity):
    RecyclerView.Adapter<Movieadapter.MyViewHolder>() {
    private var context=mainActivity
    inner class MyViewHolder(val binding: MovieListBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding=MovieListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       with(holder){
           with(movielist[position]){
               binding.tvName.text=this.getYear()
               binding.tvGenere.text=this.getGenre()
               binding.tvTitle.text=this.getTitle()
           }
           this.binding.llLayout.setOnClickListener{
           val intent= Intent(context, MainActivity2::class.java).apply {
               this.putExtra("name",movielist[position].getTitle())
               this.putExtra("genere",movielist[position].getGenre())
               this.putExtra("year",movielist[position].getYear())
           }
           context.startActivity(intent)
           }
       }
    }

    override fun getItemCount(): Int {
       return movielist.size
    }

}