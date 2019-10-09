package br.com.digitalhouse.interfaces

class Documento(override var nome: String, override var tipo: String) : Imprimivel {

    override fun imprimir() {
        println("Sou um documento word $nome e $tipo")
    }
}