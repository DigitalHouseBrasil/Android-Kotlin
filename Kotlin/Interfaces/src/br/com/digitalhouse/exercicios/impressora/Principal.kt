package br.com.digitalhouse.interfaces

fun main() {

    var contrato = Contrato("contrato DH", "contrato")
    var foto = Foto("Foto de perfil", "foto")
    var documento = Documento("RG", "Identidade")
    var impressora = Impressora()

    impressora.adicionarImprimivel(contrato)
    impressora.adicionarImprimivel(foto)
    impressora.adicionarImprimivel(documento)
    impressora.imprimirTudo()

}

