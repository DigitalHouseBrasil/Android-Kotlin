package br.digitalhouse

class ContaCorrente(override var saldo: Double, override var cliente: Cliente, var cheque: Cheque) : Conta() {


    fun depositarCheque(cheque: Cheque) {
        return println("Seu cheque foi depositado")
    }

    override fun deposito(valor: Double) {
        saldo += valor
        return println("Seu saldo atual $saldo")
    }

    override fun saque(valor: Double) {
        if (saldo >= valor){
            saldo -= valor
            return  println("Saque efetuado, saldo é de $saldo")
        } else {
            println("Não foi possivel realizar saque")
        }
    }

    override fun consultarSaldo(cliente: Cliente) {
        return println(cliente.sobrenome + " " + saldo)
    }
}