package com.example.quizapp.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.Model.Users
import com.example.quizapp.R

class LbAdapter(private val lb : ArrayList<Users>) : RecyclerView.Adapter<LbAdapter.ViewHolder>(){

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val username : TextView = itemView.findViewById(R.id.username)
        val score : TextView = itemView.findViewById(R.id.score)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.resultslist,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = lb[position]
        holder.username.text = current.name
        holder.score.text = current.score.toString()
    }

    override fun getItemCount(): Int {
        return lb.size
    }

}