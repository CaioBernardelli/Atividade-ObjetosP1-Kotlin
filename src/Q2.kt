// Questão 2
class Cliente(val nome: String, private val idade: Int = 0) {


    fun mostrarIdade() {
        println("Idade:$idade")

    }
    // Utilize os modificadores de visibilidade para definir os atributos nome e idade conforme especificado na questão

    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
}

fun main() {
    val cliente = Cliente("Caio",)
    cliente.mostrarIdade()

    // Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.
}
