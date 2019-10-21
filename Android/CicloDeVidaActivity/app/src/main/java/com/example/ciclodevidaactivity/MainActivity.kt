package com.example.ciclodevidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClique = findViewById<Button>(R.id.botao)

        btnClique.setOnClickListener {
            Toast.makeText(this, "Você clicou", Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(" LOG ", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(" LOG ", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(" LOG ", "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(" LOG ", "OnDestroy")
    }


}
