package br.com.digitalhouse.exercicios.voador

class TorreControle {

    var listaVoadores = mutableListOf<Voador>()

    fun adicionarVoador(voador: Voador) {
        listaVoadores.add(voador)
    }

    fun voemTodos() {
        for (voador in listaVoadores) {
            voador.voar()
        }
    }
}