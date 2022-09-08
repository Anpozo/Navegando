package com.example.navegadordepaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonPrevious=findViewById<Button>(R.id.button2)
        val buttonNext=findViewById<Button>(R.id.button3)
        val datoText=findViewById<TextView>(R.id.textView)

        val recibe=intent.getStringExtra("texto")
        datoText.text=recibe

        buttonPrevious.setOnClickListener {
             val backwards =Intent(this,MainActivity::class.java)
            startActivity(backwards)
        }
        buttonNext.setOnClickListener {
            val forward=Intent(this ,Tercera::class.java)
            forward.putExtra("datoText", datoText.text.toString())
            startActivity(forward)
        }





          }
}