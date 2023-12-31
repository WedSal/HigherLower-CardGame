package com.example.higher_lower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var WelcometextView: TextView
    lateinit var HigherimageView: ImageView
    lateinit var Playbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WelcometextView = findViewById(R.id.WelcometextView)
        HigherimageView = findViewById(R.id.HigherimageView)
        Playbutton = findViewById(R.id.Playbutton)

        Playbutton.setOnClickListener {

            val intent = Intent(this, GameActivity::class.java)

           startActivity(intent)
        }


    }
}