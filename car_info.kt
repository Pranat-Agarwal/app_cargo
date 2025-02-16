package com.example.app_cargo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class car_info : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var car_datalist : ArrayList<car_info_data>
    private lateinit var car_titlelist : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_car_info)

            car_titlelist = arrayOf(
                "       Registration Certificate",
                "       Diving License",
                "       PUC",
                "       Insurance",
                "       Address Proof",
                "       Vehicle Purchase Invoice",
                "       Permits",
                "       Pollution under control",
                "       Road tax",
                "       Aadhaar card",
                "       Clearance certificate",
                "       PAN card",
                "       Photographs",
                "       Vehicle Registration"
            )

            recyclerView = findViewById(R.id.car_recyclerView)
            recyclerView.layoutManager= LinearLayoutManager(this)
            recyclerView.setHasFixedSize(true)

            car_datalist = arrayListOf<car_info_data>()
            createcar()
        }

        private fun createcar(){
            for(i in car_titlelist.indices){
                var car_dat = car_info_data(car_titlelist[i])
                car_datalist.add(car_dat)
            }
            val caradapter = car_info_adapter(car_datalist,this)
            recyclerView.adapter=caradapter
        }
}