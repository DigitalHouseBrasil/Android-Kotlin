package com.example.comunicaoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextInputLayout>(R.id.textinput_nome)
        val sobrenome = findViewById<TextInputLayout>(R.id.textinput_sobrenome)
        val idade = findViewById<TextInputLayout>(R.id.textInput_idade)
        val btnEnviar = findViewById<Button>(R.id.button_enviar)

        btnEnviar.setOnClickListener {
            var nomeUsu = nome.editText?.text.toString()
            var sobrenomeUsu = sobrenome.editText?.text.toString()
            var idadeUsu = idade.editText?.text.toString()

            if (nomeUsu == "" && sobrenomeUsu == "" && idadeUsu == "") {
                Snackbar.make(btnEnviar, "Preencha os campos antes de avançar", Snackbar.LENGTH_SHORT).show()
            } else {
                levarDados(nomeUsu, sobrenomeUsu, idadeUsu)
            }
        }
    }

    fun levarDados(nome: String, sobrenome:String, idade:String) {
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("NOME", nome)
        intent.putExtra("SOBRENOME", sobrenome)
        intent.putExtra("IDADE", idade)
        startActivity(intent)
    }
}

