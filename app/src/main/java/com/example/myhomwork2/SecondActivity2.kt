package com.example.myhomwork2

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity2:AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val proLogin = findViewById<TextView>(R.id.proLogin)
        val proFile = findViewById<TextView>(R.id.proFile)

        val data = intent.getStringExtra("fromlogin")
        val data2 = intent.getBooleanExtra("ettext",false)
        proLogin.text = data
        if (data2)
        {
            proFile.text = "Логина"
        }
        else
        {
            proFile.text= "Вы зарегистрировались"
        }
        Toast.makeText(applicationContext, data,Toast.LENGTH_SHORT).show()
    }
}

