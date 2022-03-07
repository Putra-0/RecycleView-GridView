package com.example.chart

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(cnx: Context, xyz: ArrayList<Data>) : RecyclerView.Adapter<MyAdapter.Myviewholder>() {
    val ctx=cnx;
    val xyz=xyz
    class Myviewholder(v:View):RecyclerView.ViewHolder(v) {
        var title=v.findViewById(R.id.title) as TextView
        var price=v.findViewById(R.id.price) as TextView
        var image=v.findViewById(R.id.img) as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom,parent,false)
        return Myviewholder(itemView)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        val u=xyz[position]
        holder.title.setText(u.title)
        holder.price.setText(u.price)
        holder.image.setImageResource(u.image)
    }

    override fun getItemCount(): Int {
        return xyz.size
    }
}