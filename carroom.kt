package com.example.app_cargo


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_cargo.car_room.car_adapter
import com.example.app_cargo.car_room.car_data

class carroom : AppCompatActivity() {

    private lateinit var car_recyclerView: RecyclerView
    private lateinit var car_datalist : ArrayList<car_data>
    private lateinit var car1 : Array<Int>
    private lateinit var car2 : Array<Int>
    private lateinit var garag: ImageView
    private lateinit var homelogo : ImageView
    private lateinit var logosetting : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carroom)

        car1 = arrayOf(
            R.drawable.r1,
            R.drawable.r3,
            R.drawable.r5,
            R.drawable.r7,
            R.drawable.r9
        )

        car2 = arrayOf(
            R.drawable.r2,
            R.drawable.r4,
            R.drawable.r6,
            R.drawable.r8,
            R.drawable.r10
        )

        car_recyclerView = findViewById(R.id.carpics)
        car_recyclerView.layoutManager = LinearLayoutManager(this)
        car_recyclerView.setHasFixedSize(true)

        car_datalist = arrayListOf<car_data>()

        createcar()

        garag = findViewById(R.id.logo_garage)
        homelogo = findViewById(R.id.logo_home)
        logosetting = findViewById(R.id.logo_setting)


        garag.setOnClickListener{
            val intent = Intent(this,carroom::class.java)
            startActivity(intent)
        }

        homelogo.setOnClickListener{
            val intent = Intent(this,home_page::class.java)
            startActivity(intent)
        }

        logosetting.setOnClickListener{
            val intent = Intent(this,setting::class.java)
            startActivity(intent)
        }



    }

    private fun createcar(){
        for(i in car1.indices){
            var settingdata = car_data(car1[i],car2[i])
            car_datalist.add(settingdata)
        }
        car_recyclerView.adapter= car_adapter(car_datalist,this)
    }
}