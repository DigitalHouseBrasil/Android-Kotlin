package br.com.digitalhouse.exercicios.exercicio1.exercicio2.exercicio3

class Estoque(var nome : String,  qtdAtual : Int,  qtdMinima: Int) {

    var atual: Int = 0
    var minima: Int = 0

    init {
        if(qtdAtual > 0 && qtdMinima > 0){
            this.atual = qtdAtual
            this.minima = qtdMinima
        } else {
            println("Não pode ser negativo")
        }
    }

    fun mudarNome(nome: String) {
        this.nome = nome
        println(nome)
    }

    fun mudarQuantidadeMinima(qtdMinima: Int){
        this.minima = qtdMinima
        println("Quantidade Minina nova $qtdMinima")

    }

    fun darBaixa(qtdAtual: Int){
        if(atual > 0){
            atual - qtdAtual
            println(atual)

        } else {
            println("Não pode ser Negativo")
        }
    }
    fun mostra() : String{
        if(atual > 0){
            return "Estoque $nome quantidade minina $minima quantidade atual $atual"

        }else {
            return "Não pode ser Negativo Quantidade $atual, Quantidade Minima $minima"
        }
    }

    fun precisaRepor() : Boolean{
        if(atual <= minima){
            return true
        }
        return false
    }
    fun repor(qtdAtual: Int) {
       if(atual > 0)  {
           atual + qtdAtual
           println(atual)
       } else {
           println("Não pode ser Negativo")
       }

    }
}