package com.example.jasur.bashkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jasur.kotlinrecyclerview.R
import kotlinx.android.synthetic.main.video_row.view.*

class AnimalAdapter(val animalList : ArrayList<String>, val mContext: Context) : RecyclerView.Adapter<AnimalAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(mContext).inflate(R.layout.video_row, parent, false))
    }


    override fun getItemCount(): Int {
        return animalList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.tv_animal_type?.text = animalList.get(position)
    }

    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tv_animal_type = view.animal_type
    }
}