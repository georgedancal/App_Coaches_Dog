package com.example.appcoachesdog.view.ui.activities.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appcoachesdog.R

class Registro : AppCompatActivity() {
    lateinit var btregistrodatos: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        btregistrodatos=findViewById(R.id.btregistrodatos)
        btregistrodatos.setOnClickListener {
            startActivity(Intent(this,Loguin::class.java))
        }
    }
}