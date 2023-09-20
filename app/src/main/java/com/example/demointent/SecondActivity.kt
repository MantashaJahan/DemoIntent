package com.example.demointent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var greeting:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        greeting = findViewById(R.id.text)
        var greet = intent.getStringExtra("abc")
        greeting.setText("Welcome\n"+greet)
    }
}