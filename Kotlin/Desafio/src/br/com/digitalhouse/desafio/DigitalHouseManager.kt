package br.com.digitalhouse.desafio

import java.util.ArrayList

class DigitalHouseManager {

    private var professor = mutableListOf<Professor>()
    private var alunos = mutableListOf<Aluno>()
    private var curso = mutableListOf<Curso>()
    private var matricula = mutableListOf<Matricula>()

    fun registrarCurso(novoNome: String, novoCodigoCurso: Int?, novaQuantidadeMaximaDeAlunos: Int?) {
        val novoCurso = Curso(novoNome, novoCodigoCurso, novaQuantidadeMaximaDeAlunos)
        curso.add(novoCurso)
        println("Curso de ${novoCurso.nomeCurso} registrado com sucesso!")
    }

    fun excluirCurso(codigoCurso: Int?) {
        var cursoEncontrado: Curso? = null
        for (cursoProcurado in curso) {
            if (cursoProcurado.codigoCurso!!.equals(codigoCurso)) {
                cursoEncontrado = cursoProcurado
                curso.remove(cursoEncontrado)
                println("Curso removido com sucesso.")
            } else {
                println("Curso não cadastrado!")
            }

        }
    }

    fun registrarProfessorAdjunto(
        novoNome: String,
        novoSobrenome: String,
        novoCodigoProfessor: Int?,
        novaQuantidadeDeHoras: Int?
    ) {

        val novoProfessorAdjunto = ProfessorAdjunto(novoNome, novoSobrenome, novoCodigoProfessor)
        novoProfessorAdjunto.tempoDeCasa
        professor.add(novoProfessorAdjunto)
        println("O professor adjunto: $novoNome $novoSobrenome foi registrado com sucesso.")
    }

    fun registrarProfessorTitular(
        novoNome: String,
        novoSobrenome: String,
        novoCodigoProfessor: Int?,
        novaEspecialidade: String

    ) {

        val novoProfessorTitular = ProfessorTitular(novoNome, novoSobrenome,novoCodigoProfessor)
        novoProfessorTitular.tempoDeCasa
        professor.add(novoProfessorTitular)
        println("O professor titular: $novoNome $novoSobrenome foi registrado com sucesso.")
    }

    fun excluirProfessor(codigoProfessor: Int?) {
        var professorEncontrado: Professor? = null
        for (professorProcurado in professor) {
            if (professorProcurado.codigoProfessor!!.equals(codigoProfessor)) {
                professorEncontrado = professorProcurado
                professor.remove(professorEncontrado)
                println("Professor titular ${professorEncontrado.nome} ${professorEncontrado.sobrenome}  excluído com sucesso.")
            } else {
                println("Impossível excluir, professor não cadastrado.")
            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        alunos.add(novoAluno)
        println("Aluno: $nome $sobrenome foi matriculado com sucesso!")

    }

    fun matricularAluno(novoCodigoAluno: Int?, novoCodigoCurso: Int?) {
        var alunoEncontrado: Aluno? = null
        var cursoEncontrado: Curso? = null

        for (curso in curso) {
            if (curso.codigoCurso!!.equals(novoCodigoCurso)) {
                cursoEncontrado = curso
                println("***********************\nCurso encontraro\n***********************")
            }

        }
        for (aluno in alunos) {
            if (aluno.codigoAluno.equals(novoCodigoAluno)) {
                alunoEncontrado = aluno
                println("***********************\nAluno encontrado\n***********************")
            }
        }
        if (cursoEncontrado!!.adicionarUmAluno(alunoEncontrado!!)) {
            val novaMatricula = Matricula(alunoEncontrado, cursoEncontrado)
            matricula.add(novaMatricula)
            println("Matrícula efetuada com sucesso!")

        } else {
            println("Matricula não pode ser efetuada")
        }
    }


    fun alocarProfessores(codigoCurso: Int?, codigoProfessorTitular: Int?, codigoProfessorAdjunto: Int?) {

        var professorTitularEncontrado: ProfessorTitular? = null
        var professorAdjuntoEncontrado: ProfessorAdjunto? = null
        var cursoEncontrado: Curso? = null

        for (professor in professor) {
            if (professor.codigoProfessor!!.equals(codigoProfessorTitular)) {
                professorTitularEncontrado = professor as ProfessorTitular
            }
        }
        for (professor in professor) {
            if (professor.codigoProfessor!!.equals(codigoProfessorAdjunto)) {
                professorAdjuntoEncontrado = professor as ProfessorAdjunto
            }
        }
        for (curso in curso) {
            if (curso.codigoCurso!!.equals(codigoCurso)) {
                cursoEncontrado = curso
            }

        }
        cursoEncontrado!!.professorTitular = professorTitularEncontrado
        cursoEncontrado!!.professorAdjunto = professorAdjuntoEncontrado

        println(
            "O curso de : ${cursoEncontrado.nomeCurso} agora tem como Professor Titular: " +
                    "${cursoEncontrado.professorTitular} e ${cursoEncontrado.professorAdjunto} como Professor Adjunto"
        )
    }
}