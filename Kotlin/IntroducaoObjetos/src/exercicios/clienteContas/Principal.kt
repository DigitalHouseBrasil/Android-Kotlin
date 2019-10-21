package exercicios.clienteContas

fun main() {

    var clienteMaria = Cliente("Maria", "Santos")
    var clientePaulo = Cliente("Paulo", "Silveira")

    var contaMaria = Conta(2222,10.0,clienteMaria)
    var contaPaulo = Conta(3333, 5.0, clientePaulo)

    contaMaria.deposito(50.0)
    contaMaria.saque(10.0)

    contaPaulo.deposito(40.0)
    contaPaulo.saque(20.0)
}