package br.digitalhouse

fun main() {

    var cheque = Cheque(150.50)

    var joao = Cliente(11, "Camargo", "34.456.034-1", "345.234.563-34")

    var conta = ContaCorrente(20.5, joao, cheque)

    conta.depositarCheque(cheque)

    conta.deposito(50.5)

    conta.saque(25.5)

    conta.consultarSaldo(joao)


}