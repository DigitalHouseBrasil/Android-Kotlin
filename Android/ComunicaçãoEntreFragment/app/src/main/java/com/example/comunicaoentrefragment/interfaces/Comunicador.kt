package com.example.comunicaoentrefragment.interfaces

import com.example.comunicaoentrefragment.model.SistemaOperacional

interface Comunicador {
    fun recebeMensagem(sistemaOperacional: SistemaOperacional)
}