package com.example.appcoachesdog.view.ui.activities.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.appcoachesdog.R

class Loguin : AppCompatActivity() {
    lateinit var btlogin: Button
    lateinit var txrecuperar: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loguin)
        btlogin=findViewById(R.id.btloguin)
        txrecuperar=findViewById(R.id.txrecuperar)
        btlogin.setOnClickListener {
            startActivity(Intent(this,Perfil::class.java))
        }
        txrecuperar.setOnClickListener {
            startActivity(Intent(this,Recuperar::class.java))
        }
    }
}