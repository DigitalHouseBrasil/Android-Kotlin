package com.example.comunicaoactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextInputLayout>(R.id.textinput_nome)
        val sobrenome = findViewById<TextInputLayout>(R.id.textinput_sobrenome)
        val idade = findViewById<TextInputLayout>(R.id.textInput_idade)

        button_enviar.setOnClickListener {
            val nomeUsu = nome.editText?.text.toString()
            val sobrenomeUsu = sobrenome.editText?.text.toString()
            val idadeUsu = idade.editText?.text.toString()

            if (nomeUsu.isEmpty() && sobrenomeUsu.isEmpty() && idadeUsu.isEmpty()) {
                Snackbar.make(button_enviar, "Preencha os campos antes de avançar", Snackbar.LENGTH_SHORT).show()
            } else {
                levarDados(nome = nomeUsu, sobrenome = sobrenomeUsu, idade = idadeUsu)
            }
        }
    }

    fun levarDados(nome: String, sobrenome:String, idade:String) {
        val intent = Intent(this, SegundaActivity::class.java)

        val bundle = bundleOf(
                "NOME" to nome,
                "SOBRENOME" to sobrenome,
                "IDADE" to idade
        )
        
        intent.putExtras(bundle)
        startActivity(intent)


    }
}

