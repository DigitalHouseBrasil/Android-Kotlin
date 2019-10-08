package br.digitalhouse

class ContaPoupanca(override var saldo: Double, override var cliente: Cliente) : Conta() {



    override fun consultarSaldo(cliente: Cliente) {
        return println(cliente.sobrenome + " " + saldo)
    }

    override fun deposito(valor: Double) {
        saldo += valor
        return println("Seu saldo atual $saldo")
    }

    override fun saque(valor: Double) {
        saldo -= valor
        return println("Seu saldo atual $saldo")
    }

}