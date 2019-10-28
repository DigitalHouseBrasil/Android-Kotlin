package com.example.fragmentsaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVermelho.setOnClickListener {
            replaceFragment(R.id.container, VermelhoFragment())
        }

        btnVerde.setOnClickListener {
            replaceFragment(R.id.container, VerdeFragment())
        }
    }

    private fun replaceFragment(container: Int, fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(container, fragment)
            .commit()
    }
}
