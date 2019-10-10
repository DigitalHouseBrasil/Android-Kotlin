package br.com.digitalhouse.exercicios.exercicio2

import br.com.digitalhouse.exercicios.exercicio3.Estoque

fun main() {

    var item = Item(1, "Jogo", 4, 30.5)

    println(item.getTotalFatura())

    var estoque = Estoque("Tenis", 0, 0)
    estoque.mudarNome("Calça")
    estoque.darBaixa(estoque.atual)
    println(estoque.mostra())
    println(estoque.precisaRepor())
    estoque.repor(estoque.atual)
    estoque.mudarQuantidadeMinima(5)

}