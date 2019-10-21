package exercicios.clienteContas

class Conta(numeroConta: Int, saldo: Double, titular: Cliente) {

    var saldo = saldo
    val numeroConta = numeroConta
    var titular = titular

    fun deposito(valor: Double){
        this.saldo += valor
        return println("Deposito no valor de $saldo")
    }

    fun saque(valor: Double){
        if (valor > this.saldo){
            println("Saldo insuficiente")
        }else{
            this.saldo -= valor
            println("Saldo atual $saldo")
        }
    }
}