package br.com.digitalhouse.exercicio2

fun main() {
    var listaNome = mutableMapOf<String, String>()

    listaNome["João"] = "Juan, Fissura, Maromba"
    listaNome["Miguel"] = "Night Watch, Brunce Wayne, Tampinha"
    listaNome["Maria"] = "Wonder Woman, Mary, Marilene"
    listaNome["Lucas"] = "Lukinha, Jorge, George"


    for (item in listaNome ){
        println(item)
    }
}