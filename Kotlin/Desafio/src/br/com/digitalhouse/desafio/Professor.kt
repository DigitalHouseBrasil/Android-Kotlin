package br.com.digitalhouse.desafio

abstract class Professor(
    var nome: String? = null,
    var sobrenome: String? = null,
    var codigoProfessor: Int? = null
) {

    var tempoDeCasa: Int? = null

    override fun toString(): String {
        return "Professor(nome=$nome, sobrenome=$sobrenome, tempoDeCasa=$tempoDeCasa, codigoProfessor=$codigoProfessor)"
    }
}