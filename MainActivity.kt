package com.example.myproject2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject2.R.id.BtnNext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val next = findViewById<Button>(BtnNext)
        next.setOnClickListener{
           val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}