package br.com.digitalhouse.exercicio2

class Coca(var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Coca

        if (tamanho != other.tamanho) return false

        return true
    }

}