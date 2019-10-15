package br.com.digitalhouse.exercicio1

fun main() {
    var listaLoteria = arrayListOf<String>()

    listaLoteria.add("ovo")
    listaLoteria.add("escopeta")
    listaLoteria.add("cavalo")
    listaLoteria.add("dentista")
    listaLoteria.add("fogo")

    println(listaLoteria)

    var listaNome = mutableMapOf<String, String>()

    listaNome["João"] = "Juan, Fissura, Maromba"
    listaNome["Miguel"] = "Night Watch, Brunce Wayne, Tampinha"
    listaNome["Maria"] = "Wonder Woman, Mary, Marilene"
    listaNome["Lucas"] = "Lukinha, Jorge, George"


    for (item in listaNome ){
        println(item)
    }



}