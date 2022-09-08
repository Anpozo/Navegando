package com.example.navegadordepaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class Tercera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)


        val buttonBack= findViewById<Button>(R.id.button4)
        val toMainActivity=findViewById<Button>(R.id.button5)
        val datoText2:TextView=findViewById(R.id.textView2)
        val dato =intent.getStringExtra("datoText")
        datoText2.setText(dato)




        buttonBack.setOnClickListener {
            val backwards = Intent(this , Segunda::class.java)
            startActivity(backwards)
        }
         toMainActivity.setOnClickListener {
             val toMain = Intent(this, MainActivity::class.java)
             startActivity(toMain)
         }
    }
}