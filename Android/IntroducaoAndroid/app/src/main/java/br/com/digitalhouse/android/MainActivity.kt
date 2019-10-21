package br.com.digitalhouse.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<EditText>(R.id.edit_text_nome)
        val email = findViewById<EditText>(R.id.edit_text_email)
        val enviar = findViewById<Button>(R.id.button_enviar)

        enviar.setOnClickListener { v ->

            var nomeRecebido = nome.text.toString()
            var emailRecebido = email.text.toString()

            if (!nomeRecebido.isEmpty() && !emailRecebido.isEmpty()){
                Toast.makeText(this, "Dados OK", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Preencha os campos", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
