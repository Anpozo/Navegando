package com.example.navegadordepaginas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var dato:TextView?=null
        dato= findViewById<EditText>(R.id.dato)
        val boton=findViewById<Button>(R.id.button)

         dato.setError("Text something")


        boton.setOnClickListener {
            if (!dato.text.isEmpty()){
                val texto= dato.text.toString()
                val enviar:Intent= Intent(this,Segunda::class.java)
                enviar.putExtra("texto", texto)
                startActivity(enviar)
            }else{ dato.setError("Text something")
                Toast.makeText(this,"Text something", Toast.LENGTH_SHORT).show()}
        }







    }




    }