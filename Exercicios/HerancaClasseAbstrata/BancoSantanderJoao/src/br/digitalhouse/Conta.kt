package br.digitalhouse

abstract class Conta {

    abstract var saldo : Double

    abstract var cliente : Cliente

    abstract fun deposito(valor: Double)

    abstract fun saque(valor: Double)

    abstract fun consultarSaldo (cliente: Cliente)


}