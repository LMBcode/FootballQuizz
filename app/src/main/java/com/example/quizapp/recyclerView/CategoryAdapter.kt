package com.example.quizapp.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.Model.CategoryObject.liste
import com.example.quizapp.R

class CategoryAdapter() : RecyclerView.Adapter<CategoryAdapter.ViewHolder>(){
    private val categorieList = liste
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val text : TextView = itemView.findViewById(R.id.text)
        val image : ImageView = itemView.findViewById(R.id.image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.categorieslayout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = categorieList[position]
        holder.text.text = current.categoryName
        holder.image.setImageResource(current.image)
        holder.image.setOnClickListener {
            // Intent to a New Activity
        }
    }

    override fun getItemCount(): Int {
        return categorieList.size
    }
}