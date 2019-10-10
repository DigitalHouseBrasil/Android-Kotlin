package br.com.digitalhouse.exercicios.exercicio1

class Professor(var nome : String, var RD: Int) {


    fun darAulas(aula: Aula) : Aula{
        println(aula.materia)
        return aula
    }

    fun fazerChamada(listaDeAlunos: MutableList<Aluno>) : MutableList<Aluno>{
        for (Aluno in listaDeAlunos){
            println(Aluno)
        }
        return listaDeAlunos
    }


}