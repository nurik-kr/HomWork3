package com.example.myhomwork2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val regLogin = findViewById<EditText>(R.id.regLogin)
        val regPassword = findViewById<EditText>(R.id.regPassword)
        val regisration = findViewById<Button>(R.id.regisration)

        regisration.setOnClickListener {
            val text = regLogin.text.toString()
            val intent = Intent(applicationContext, SecondActivity2::class.java)

            intent.putExtra("fromlogin", text)
            intent.putExtra("ettext", false)
            startActivity(intent)
        }
    }
}
