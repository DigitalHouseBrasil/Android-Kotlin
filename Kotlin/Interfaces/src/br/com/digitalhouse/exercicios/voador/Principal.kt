package br.com.digitalhouse.exercicios.voador

fun main() {
    var pato = Pato(0)
    var aviao = Aviao(5)
    var superHomem = SuperHomem(10)
    var torreControle = TorreControle()

    torreControle.adicionarVoador(pato)
    torreControle.adicionarVoador(aviao)
    torreControle.adicionarVoador(superHomem)
    torreControle.voemTodos()

}