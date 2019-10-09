package br.com.digitalhouse.interfaces

class Foto(override var nome: String, override var tipo: String) :Imprimivel {

    override fun imprimir() {
        println("Sou uma selfie $nome, $tipo")
    }
}