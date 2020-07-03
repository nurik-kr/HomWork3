package com.example.myhomwork2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

val trueinputname ="maks"
val truepass= "12345"

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regist = findViewById<Button>(R.id.regist)

        regist.setOnClickListener {
            val intent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }

        val Login = findViewById<Button>(R.id.Login)
        val inputName = findViewById<EditText>(R.id.inputName)
        val password = findViewById<EditText>(R.id.password)

        Login.setOnClickListener {
            val text = Login.text.toString()
            val passText = password.text.toString()
            if (text == trueinputname && passText == truepass){

                Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG ).show()
            }

            val intent = Intent(applicationContext,SecondActivity2::class.java)

            intent.putExtra("fromlogin",text)
            intent.putExtra("ettext", true)
            startActivity(intent)
        }
    }
}