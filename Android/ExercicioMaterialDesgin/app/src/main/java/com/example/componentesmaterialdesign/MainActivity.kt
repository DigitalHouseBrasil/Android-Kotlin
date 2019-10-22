package com.example.componentesmaterialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextInputLayout>(R.id.text_inputNome)
        val email = findViewById<TextInputLayout>(R.id.text_inputEmail)
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)


        fab.setOnClickListener {
            var nomeUsu : String = nome.editText?.text.toString()
            var emailUsu : String = email.editText?.text.toString()

            when{
                nomeUsu == ""-> Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show()
                emailUsu == "" ->Toast.makeText(this, "Preencha o email", Toast.LENGTH_SHORT).show()
                else -> Snackbar.make(fab, "Obrigado por se cadastrar", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}
