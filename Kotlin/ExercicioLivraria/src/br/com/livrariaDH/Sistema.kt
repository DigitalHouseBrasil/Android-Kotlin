package br.com.livrariaDH

class Sistema(var nomeColecao: String, var codColecao: Int, var precoSis: Double ) {


    var lista = mutableListOf<Livro>()
    var colecao = mutableListOf<Livro>()

    fun cadastrarLivro(livro: Livro) {
        lista.add(livro)
        println("Livro Cadastrado com sucesso -- ${livro.titulo}")
    }

    fun cadastrarLivro(nomeColecao: String, codColecao: Int, livro: Livro){
        colecao.add(livro)
        this.nomeColecao = nomeColecao
        this.codColecao = codColecao
    }


    fun imprimeColecao(){
        println("Nome coleção $nomeColecao e Codigo $codColecao")
        for (valor in colecao){
            println(valor.autor + " - " + valor.titulo)
        }
        println("Valor da coleção: $precoSis")
    }

    fun consultarLivro(cod: Int){
        for (item in lista)
            if(cod == item.codigo){
                println("Aqui está o Livro: ${item.titulo}, ${item.autor}, ${item.preco}")
            }

    }

    fun vender(cod: Int){
        for (item in lista){
            if(cod == item.codigo && item.estoque <= 0){
                lista.remove(item)
            }
            println("Item removido ${item.titulo}")
        }

    }
}