package br.com.digitalhouse.exercicios.voador

class SuperHomem(var experiencia: Int): Voador {

    override fun voar() {
        experiencia += 3
        println("Estou voando como um campeão - experiencia: ${experiencia}")
    }
}