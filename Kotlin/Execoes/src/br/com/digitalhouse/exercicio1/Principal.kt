package br.com.digitalhouse.exercicio1

fun main() {


    var listaAnimal = mutableListOf<String>()

        listaAnimal.add("JOAO")
        listaAnimal.add("JESSICA")
        listaAnimal.add("TAIRO")

        listaAnimal.get(3)



    try {
        listaAnimal.get(3)
    } catch (ex : IndexOutOfBoundsException){
        println("Caiu na exeção")
        ex.localizedMessage
    }
}