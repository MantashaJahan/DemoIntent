package com.example.demointent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var next:Button
    private lateinit var name:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next = findViewById(R.id.nextbtn)
        name = findViewById(R.id.anything)

       next.setOnClickListener {
           var username:String = name.getText().toString()
           var intent = Intent(this@MainActivity,SecondActivity::class.java)
           intent.putExtra("abc",username)
           startActivity(intent)
           finish()
       }
       }
}