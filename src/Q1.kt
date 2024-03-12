class Produto {
    var nome: String
    var preco: Double

    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }
}
fun main() {
    val listaProdutos = mutableListOf<Produto>()

    // Adicionando produtos à lista
    listaProdutos.add(Produto("Banana", 10.0))
    listaProdutos.add(Produto("Kiwi",20.0))
    listaProdutos.add(Produto("Uva",1.0))


    println("Detalhes dos Produtos:")
    for (produto in listaProdutos) {
        println("Nome: ${produto.nome}, Preço: ${produto.preco}")
    }

}