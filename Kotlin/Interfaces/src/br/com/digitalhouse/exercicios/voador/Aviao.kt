package br.com.digitalhouse.exercicios.voador

class Aviao(var horas: Int) : Voador{

    override fun voar() {
        horas += 13
        println("Estou voando como um avião - horas: ${horas}")
    }
}