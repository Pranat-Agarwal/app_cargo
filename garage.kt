package com.example.app_cargo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_cargo.database.AppDatabase
import com.example.app_cargo.database.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class garage : AppCompatActivity() {

    private lateinit var rvUsers: RecyclerView
    private lateinit var userAdapter: UserAdapter
    private lateinit var garag: ImageView
    private lateinit var homelogo : ImageView
    private lateinit var logosetting : ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_garage)


        rvUsers = findViewById(R.id.garage_rv)
        userAdapter = UserAdapter(listOf())
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = userAdapter



        loadUsers()

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

    private fun loadUsers() {
        CoroutineScope(Dispatchers.IO).launch {
            val users = AppDatabase.getDatabase(applicationContext).userDao().getAllUsers()
            withContext(Dispatchers.Main) {
                userAdapter.updateUser(users)
            }
        }
    }
}