package com.example.appcoachesdog.view.ui.activities.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appcoachesdog.R

class Quienes_Somos : AppCompatActivity() {
    lateinit var bthome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quienes_somos)
        bthome=findViewById(R.id.bthome)
        bthome.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}