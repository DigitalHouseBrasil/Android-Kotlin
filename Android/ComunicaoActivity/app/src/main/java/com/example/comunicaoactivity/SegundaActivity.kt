package com.example.comunicaoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val nome = intent.getStringExtra("NOME")
        val sobrenome = intent.getStringExtra("SOBRENOME")
        val idade = intent.getStringExtra("IDADE")

        text_texto.text = "Bem vindo $nome $sobrenome. Sua idade é $idade"
    }
}
