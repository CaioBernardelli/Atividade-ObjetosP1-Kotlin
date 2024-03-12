abstract class Personagem {
    // Crie um método abstrato atacar() conforme especificado na questão


    abstract fun atacar()


    }


class Guerreiro : Personagem() {
    override fun atacar() {
        println("Atacar com espada")
        // Implemente o método atacar() de acordo com as características do Guerreiro
    }
}

class Mago : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Mago
        println("Atacar com fogo")
    }
}

fun main() {

    val GuerreiroDaMontanha = Guerreiro()
    GuerreiroDaMontanha.atacar()

    val MagodeFogo = Mago()
    MagodeFogo.atacar()






    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
}