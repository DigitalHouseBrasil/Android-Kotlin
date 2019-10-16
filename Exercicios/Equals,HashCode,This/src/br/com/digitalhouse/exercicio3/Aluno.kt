package br.com.digitalhouse.exercicio3

class Aluno(var nome: String, var numeroDeAluno: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroDeAluno != other.numeroDeAluno) return false

        return true
    }

}