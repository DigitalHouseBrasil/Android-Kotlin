package br.com.digitalhouse.exercicio1

class Pessoa(var nome: String, var RG : Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (RG != other.RG) return false

        return true
    }
}