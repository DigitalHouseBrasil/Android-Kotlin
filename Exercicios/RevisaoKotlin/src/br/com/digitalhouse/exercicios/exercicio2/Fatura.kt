package br.com.digitalhouse.exercicios.exercicio2

open class Fatura(numeroItemFat: Int,  descricaoItem: String,  quantidadeItem: Int,  precoItem: Double) {

    var numeroItem : Int
    var descricao: String
    var quantidade: Int = 0
    var preco: Double = 0.0


    init {

        this.numeroItem = numeroItemFat
        this.descricao = descricaoItem
        if(precoItem >0){
            this.preco = precoItem
        }
        if(quantidadeItem >0){
            this.quantidade = quantidadeItem
        }

    }

    fun getTotalFatura() : Double {
        var resultado = preco * quantidade
        return resultado
    }
}