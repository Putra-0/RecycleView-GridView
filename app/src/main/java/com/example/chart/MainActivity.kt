package com.example.chart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rv=findViewById(R.id.recycle) as RecyclerView
        val xyz= arrayListOf<Data>()

        xyz.add(Data("Logitech Z213","Rp 729.999", R.drawable.a1))
        xyz.add(Data("Monster S110 Superstar","Rp 721.999", R.drawable.a2))
        xyz.add(Data("Anker Soundcore 2","Rp 736.000", R.drawable.a3))
        xyz.add(Data("Sound Core Mini 2","Rp 973.000", R.drawable.a4))
        xyz.add(Data("Sony SRS-XB13","Rp 909.000", R.drawable.a5))
        xyz.add(Data("JBL Charge 3","Rp 3.010.999", R.drawable.a6))
        xyz.add(Data("A2+ Home","Rp 3.999.999", R.drawable.a7))

        rv.layoutManager=LinearLayoutManager(this)

        rv.layoutManager=GridLayoutManager(this,2)
        val aa=MyAdapter(applicationContext,xyz)
        rv.adapter=aa

    }
}