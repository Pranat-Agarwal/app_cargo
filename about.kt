package com.example.app_cargo


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import at.blogc.android.views.ExpandableTextView

class about : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)

        var desc1 : ExpandableTextView = findViewById(R.id.tcd1)
        var drop1 : ImageButton = findViewById(R.id.tci1)
        drop1.setOnClickListener(){
            if(desc1.visibility== View.GONE){
                desc1.visibility= View.VISIBLE
                drop1.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc1.visibility= View.GONE
                drop1.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc2 : ExpandableTextView = findViewById(R.id.tcd2)
        var drop2 : ImageButton = findViewById(R.id.tci2)
        drop2.setOnClickListener(){
            if(desc2.visibility== View.GONE){
                desc2.visibility= View.VISIBLE
                drop2.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc2.visibility= View.GONE
                drop2.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc3 : ExpandableTextView = findViewById(R.id.tcd3)
        var drop3 : ImageButton = findViewById(R.id.tci3)
        drop3.setOnClickListener(){
            if(desc3.visibility== View.GONE){
                desc3.visibility= View.VISIBLE
                drop3.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc3.visibility= View.GONE
                drop3.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc4 : ExpandableTextView = findViewById(R.id.tcd4)
        var drop4 : ImageButton = findViewById(R.id.tci4)
        drop4.setOnClickListener(){
            if(desc4.visibility== View.GONE){
                desc4.visibility= View.VISIBLE
                drop4.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc4.visibility= View.GONE
                drop4.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc5 : ExpandableTextView = findViewById(R.id.tcd5)
        var drop5 : ImageButton = findViewById(R.id.tci5)
        drop5.setOnClickListener(){
            if(desc5.visibility== View.GONE){
                desc5.visibility= View.VISIBLE
                drop5.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc5.visibility= View.GONE
                drop5.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc6 : ExpandableTextView = findViewById(R.id.tcd6)
        var drop6 : ImageButton = findViewById(R.id.tci6)
        drop6.setOnClickListener(){
            if(desc6.visibility== View.GONE){
                desc6.visibility= View.VISIBLE
                drop6.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc6.visibility= View.GONE
                drop6.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc7 : ExpandableTextView = findViewById(R.id.tcd7)
        var drop7 : ImageButton = findViewById(R.id.tci7)
        drop7.setOnClickListener(){
            if(desc7.visibility== View.GONE){
                desc7.visibility= View.VISIBLE
                drop7.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc7.visibility= View.GONE
                drop7.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc8 : ExpandableTextView = findViewById(R.id.tcd8)
        var drop8 : ImageButton = findViewById(R.id.tci8)
        drop8.setOnClickListener(){
            if(desc8.visibility== View.GONE){
                desc8.visibility= View.VISIBLE
                drop8.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc8.visibility= View.GONE
                drop8.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc9 : ExpandableTextView = findViewById(R.id.tcd9)
        var drop9 : ImageButton = findViewById(R.id.tci9)
        drop9.setOnClickListener(){
            if(desc9.visibility== View.GONE){
                desc9.visibility= View.VISIBLE
                drop9.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc9.visibility= View.GONE
                drop9.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }



        var desc10 : ExpandableTextView = findViewById(R.id.tcd10)
        var drop10 : ImageButton = findViewById(R.id.tci10)
        drop10.setOnClickListener(){
            if(desc10.visibility== View.GONE){
                desc10.visibility= View.VISIBLE
                drop10.setImageResource(R.drawable.baseline_keyboard_arrow_up_24)
            }
            else{
                desc10.visibility= View.GONE
                drop10.setImageResource(R.drawable.baseline_keyboard_arrow_down_24)
            }
        }

    }
}