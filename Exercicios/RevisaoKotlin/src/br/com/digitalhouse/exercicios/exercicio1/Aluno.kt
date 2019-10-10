package br.com.digitalhouse.exercicios.exercicio1

class Aluno (var ra: Int, var nome: String, var sobrenome: String) {


    fun assistirAula(): Boolean{
        println("O aluno está assistindo aula")
        return true
    }

    fun fazerLicaoDeCasa(): Boolean{
        println("O aluno está fazendo lição de casa")
        return true
    }

}