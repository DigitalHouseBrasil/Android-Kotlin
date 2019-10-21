package br.com.digitalhouse.desafio

import java.util.ArrayList

class Curso(
    var nomeCurso: String? = null,
    var codigoCurso: Int? = null,
    var quantidadeMaximaDeAlunos: Int? = null) {

    var alunosMatriculados = mutableListOf<Aluno>()
    var professorTitular: Professor? = null
    var professorAdjunto: ProfessorAdjunto? = null

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        for (aluno in alunosMatriculados) {
            if (quantidadeMaximaDeAlunos != null) {
                if (!aluno.equals(umAluno) && quantidadeMaximaDeAlunos!! <= 40) {
                    return true
                }
            }
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        for (aluno in alunosMatriculados) {
            if (aluno.equals(umAluno)) {
                alunosMatriculados.remove(umAluno)
                System.out.println(
                    "Aluno ${umAluno.nome} ${umAluno.sobrenome} removido do curso $nomeCurso com sucesso"
                )
            } else {
                println("Aluno não encontrado")
            }

        }
    }


}