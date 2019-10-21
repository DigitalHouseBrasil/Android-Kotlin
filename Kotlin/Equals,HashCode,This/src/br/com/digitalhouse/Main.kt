package br.com.digitalhouse

import br.com.digitalhouse.exercicio1.Pessoa
import br.com.digitalhouse.exercicio2.Coca
import br.com.digitalhouse.exercicio3.Aluno

fun main() {

    var pessoa1 = Pessoa("João", 1029384756)

    var pessoa2 = Pessoa("Jessica", 1029384756)


    //comparação entre os dois objetos de pessoa, sem a sobrescrita da função equals
    println(pessoa1.equals(pessoa2)) // false

    //comparação entre os dois objetos de pessoa, com a sobrescrita da função equals, para comparar apenas o RG
    println(pessoa1.equals(pessoa2)) // true


    var coca1 = Coca(10, 5.5)

    var coca2 = Coca(10, 2.5)

    //compara se a coca tem o mesmo tamanho, com a função equals sobrescrito, para comparar apenas o tamanho
    println(coca1.equals(coca2))

    var aluno1 = Aluno("Tairo", 2938)
    var aluno2 = Aluno("Joao", 3847)
    var aluno3 = Aluno("Jessica", 2938)

    var listaAlunos = mutableListOf<Aluno>()
    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)
    listaAlunos.add(aluno3)

    println(listaAlunos.contains(aluno1))


}