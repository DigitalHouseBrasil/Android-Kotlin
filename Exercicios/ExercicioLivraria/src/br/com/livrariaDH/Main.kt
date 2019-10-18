package br.com.livrariaDH

fun main() {

    var livro1 = Livro(1, "João e Maria", "Jaum", 2000, "10293847", 10, 20.10)
    var livro2 = Livro(2, "Maria e João", "Jaum", 1997, "10293847", 20, 30.15)
    var livro3 = Livro(3, "Guerra Civil", "Jaum", 1995, "10293847", 30, 32.10)
    var livro4 = Livro(4, "JackSperon", "Jaum", 2001, "10293847", 15, 50.15)
    var livro5 = Livro(5, "Paralebum", "Jaum", 1998, "10293847", 13, 43.18)


    var sistema = Sistema("ColeçãoJaum", 10, 175.50)

    sistema.cadastrarLivro(livro1)
    sistema.cadastrarLivro(livro2)
    sistema.cadastrarLivro(livro3)
    sistema.cadastrarLivro(livro4)
    sistema.cadastrarLivro(livro5)
    println("------------------- Consultar -------------------")
    sistema.consultarLivro(1)
    println("------------------- ImprimeColecao -------------------")
    sistema.imprimeColecao()
    println("------------------- Vender -------------------")
    sistema.vender(1)
    println("------------------- ImprimeColecao -------------------")
    sistema.imprimeColecao()
}