package com.example.somaproduto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produto = findViewById<EditText>(R.id.input_nome)
        val preco = findViewById<EditText>(R.id.input_preco)
        val porcentagem = findViewById<EditText>(R.id.input_porcentagem)
        val botaoValorTotal = findViewById<Button>(R.id.button_total)


        botaoValorTotal.setOnClickListener {
            var nomeProd : String? = produto.text.toString()
            var precoProd : String = preco.text.toString()
            var porcentagemProd : String = porcentagem.text.toString()

            when {
                nomeProd.equals("") -> Toast.makeText(this, "Preencha o nome do Produto", Toast.LENGTH_LONG).show()
                precoProd.equals("") -> Toast.makeText(this, "Preencha o preco do Produto", Toast.LENGTH_LONG).show()
                porcentagemProd.equals("") -> Toast.makeText(this, "Preencha a porcentagem do Produto", Toast.LENGTH_LONG).show()
                else -> somarPreco(precoProd.toFloat(), porcentagemProd.toFloat())
            }
        }

    }

    fun somarPreco(preco: Float, porcentagem: Float) : Float{
        val somaFinal : Float = preco - (porcentagem * preco /100)
        Toast.makeText(this, "Preco total $somaFinal", Toast.LENGTH_LONG).show()
        return somaFinal
    }
}
