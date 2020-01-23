package com.example.comunicaoentrefragment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.comunicaoentrefragment.R
import com.example.comunicaoentrefragment.interfaces.Comunicador
import com.example.comunicaoentrefragment.model.SistemaOperacional

class MainActivity : AppCompatActivity(), Comunicador {

    val CHAVESISTEMA = "SISTEMA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregaFragment(PrimeiroFragment(), R.id.container1)
    }

    override fun recebeMensagem(sistemaOperacional: SistemaOperacional) {
        passandoInformacao(sistemaOperacional, CHAVESISTEMA)
    }

    fun carregaFragment(fragment: Fragment, id: Int){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(id, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun passandoInformacao(sistemaOperacional: SistemaOperacional, chave:String){
        val bundle = Bundle()
        bundle.putParcelable(chave,sistemaOperacional)
        val segundoFragment = SegundoFragment()
        segundoFragment.arguments = bundle
        carregaFragment(segundoFragment, R.id.container1)
    }
}
