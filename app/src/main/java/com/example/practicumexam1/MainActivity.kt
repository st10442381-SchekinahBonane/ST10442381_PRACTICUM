package com.example.practicumexam1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val startBtn: Button = findViewById(R.id.startBtn)
        val exitBtn: Button = findViewById(R.id.exitBtn)

        startBtn.setOnClickListener{
            val intent = Intent( this, MainScreen::class.java)
            startActivity(intent)
            finish()
        }

        exitBtn.setOnClickListener {
            finish()
        }
    }
}