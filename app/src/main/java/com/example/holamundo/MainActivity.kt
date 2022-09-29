package com.example.holamundo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.time.format.DateTimeFormatter
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    var horaInicio : Long = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    horaInicio = System.currentTimeMillis()
        val myButton: Button = findViewById(R.id.my_button)
        myButton.text = "NooOoOOoO"
       val mensaje : TextView = findViewById(R.id.miTexto)
        mensaje.text="TexMexDoritos"

    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        
        Log.d("Estado","onResume")

    }
    override fun onPause(){
        super.onPause()
        val horaFinal = System.currentTimeMillis()
        val t = (horaFinal-horaInicio)/10000000
        Log.d("Estado", "$t")
        val mensajeTiempo:TextView=findViewById(R.id.tiempoEjecucion)

        mensajeTiempo.text = t.toString()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Estado", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado","onDestroy")
               }

}