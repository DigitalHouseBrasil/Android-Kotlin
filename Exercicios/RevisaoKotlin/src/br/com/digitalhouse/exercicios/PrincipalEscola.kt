package br.com.digitalhouse.exercicios

import br.com.digitalhouse.exercicios.exercicio1.*

fun main() {
    var aluno1 = Aluno(1234542, "Jaum", "Felipe")
    var aluno2 = Aluno(1335467, "Pamela", "Garcia" )
    var aluno3 = Aluno(3557573, "Cesar", "Michelin")
    var aluno4 = Aluno(4657644, "Ana", "Pereira")


    var professor1 = Professor("Jessica", 1234653)
    var professor2 = Professor("Tairo", 2579457)
    var professor3 = Professor("Vinicius", 7482516)
    var professor4 = Professor("Hendy", 8094327)

    val listaAlunos = mutableListOf<Aluno>()

    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)
    listaAlunos.add(aluno3)
    listaAlunos.add(aluno4)

    var materia1 = Materia("Kotlin sem Objeto")
    var materia2 = Materia("Kotlin com Objeto")
    var materia3 = Materia("Metodologias Ageis")
    var materia4 = Materia("GitHub")

    var aula1 = Aula(materia1, "19:00", "22:30")
    var aula2 = Aula(materia2, "19:00", "22:30")
    var aula3 = Aula(materia3, "19:00", "22:30")
    var aula4 = Aula(materia4, "19:00", "22:30")

    val listaDeAulas = mutableListOf<Aula>()
    listaDeAulas.add(aula1)
    listaDeAulas.add(aula2)
    listaDeAulas.add(aula3)
    listaDeAulas.add(aula4)

    var curso1 = Curso("Mobile Android", listadeAlunos = listaAlunos, listadeAulas = listaDeAulas, professor = professor1)
    var curso2 = Curso("Mobile Android", listadeAlunos = listaAlunos, listadeAulas = listaDeAulas, professor = professor2)
    var curso3 = Curso("Mobile Android", listadeAlunos = listaAlunos, listadeAulas = listaDeAulas, professor = professor3)
    var curso4 = Curso("Mobile Android", listadeAlunos = listaAlunos, listadeAulas = listaDeAulas, professor = professor4)

    var turma = Turma("MobileAndroid01", curso1)

    aluno1.assistirAula()

    aluno1.fazerLicaoDeCasa()

    turma.consultarCurso(curso1)

}