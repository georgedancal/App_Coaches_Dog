package com.example.appcoachesdog.view.ui.activities.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appcoachesdog.R

class MainActivity : AppCompatActivity() {
    lateinit var btquienes:Button
    lateinit var btingreso:Button
    lateinit var btregistro2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btquienes=findViewById(R.id.btquienes)
        btingreso=findViewById(R.id.btingreso)
        btregistro2=findViewById(R.id.btregistro2)

        btquienes.setOnClickListener {
            startActivity(Intent(this,Quienes_Somos::class.java))
        }
        btingreso.setOnClickListener {
            startActivity(Intent(this,Loguin::class.java))
        }
        btregistro2.setOnClickListener {
            startActivity(Intent(this,Registro::class.java))
        }
    }
}