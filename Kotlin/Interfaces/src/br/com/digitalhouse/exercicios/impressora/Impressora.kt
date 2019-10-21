package br.com.digitalhouse.interfaces

class Impressora {

    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarImprimivel(imprimivel: Imprimivel) {
        listaImprimivel.add(imprimivel)
    }

    fun imprimirTudo() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}