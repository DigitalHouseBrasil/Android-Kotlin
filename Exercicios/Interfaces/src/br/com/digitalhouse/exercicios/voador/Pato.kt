package br.com.digitalhouse.exercicios.voador

class Pato(var energia: Int): Voador {

    override fun voar() {
        energia -= 5
        println("Estou voando como um pato - energia: ${energia}")
    }
}