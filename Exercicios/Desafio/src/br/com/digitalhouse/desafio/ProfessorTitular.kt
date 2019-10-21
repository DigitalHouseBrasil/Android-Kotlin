package br.com.digitalhouse.desafio

data class ProfessorTitular(var novoNome: String?,
                            var novoSobrenome: String?,
                            var novoCodigoProfessor: Int?
) : Professor(novoNome, novoSobrenome, novoCodigoProfessor) {

    val especialidade: String? = null
}