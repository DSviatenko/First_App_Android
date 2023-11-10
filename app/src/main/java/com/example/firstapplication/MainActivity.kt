package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button1 = findViewById<Button>(R.id.button1)
//        button1.setOnClickListener{
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("animalName", animal1.name)
//            intent.putExtra("animalDescription", animal1.description)
//            intent.putExtra("animalImageResId", animal1.imageResId)
//            startActivity(intent)
//        }
//
//        val button2 = findViewById<Button>(R.id.button2)
//        button2.setOnClickListener{
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("animalName", animal2.name)
//            intent.putExtra("animalDescription", animal2.description)
//            intent.putExtra("animalImageResId", animal2.imageResId)
//            startActivity(intent)
//        }
//
//        val button3 = findViewById<Button>(R.id.button3)
//        button3.setOnClickListener{
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("animalName", animal3.name)
//            intent.putExtra("animalDescription", animal3.description)
//            intent.putExtra("animalImageResId", animal3.imageResId)
//            startActivity(intent)
//        }
    }

//    private lateinit var navController: NavController
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Отримайте NavController з вашого контейнера навігації
//        navController = findNavController(R.id.nav_graph)
//    }
}