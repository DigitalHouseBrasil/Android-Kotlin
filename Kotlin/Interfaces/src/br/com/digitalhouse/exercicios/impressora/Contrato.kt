package br.com.digitalhouse.interfaces

class Contrato(override var nome: String, override var tipo: String) : Imprimivel {

    override fun imprimir() {
        println("Sou um contrato muito legal $nome e $tipo")
    }
}