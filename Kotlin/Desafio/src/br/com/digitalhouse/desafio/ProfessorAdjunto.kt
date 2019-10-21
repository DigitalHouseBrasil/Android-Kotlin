package br.com.digitalhouse.desafio

data class ProfessorAdjunto(
    var novoNome: String?,
    var novoSobrenome: String?,
    var novoCodigoProfessor: Int?
) : Professor(novoNome, novoSobrenome, novoCodigoProfessor) {

    var horasMonitoria: Int? = null

}