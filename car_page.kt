package com.example.app_cargo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_cargo.car_room.car_data
import com.example.app_cargo.carpage.carpage_adapter
import com.example.app_cargo.carpage.carpage_data

class car_page : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardatalist : ArrayList<carpage_data>
    private lateinit var carlist : Array<Int>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_car_page)


        carlist = arrayOf(
            R.drawable.i1,
            R.drawable.i2,
            R.drawable.i3,
            R.drawable.i4
        )

        recyclerView = findViewById(R.id.carpageview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        cardatalist = arrayListOf<carpage_data>()
        createslide()

        val btn = findViewById<Button>(R.id.buy)

        btn.setOnClickListener{
            val intent = Intent(this,yourinfo::class.java)
            startActivity(intent)
        }
    }

    private fun createslide(){
        for(i in carlist.indices){
            var car_dat = carpage_data(carlist[i])
            cardatalist.add(car_dat)
        }
        val caradapter = carpage_adapter(cardatalist)
        recyclerView.adapter=caradapter
    }
}