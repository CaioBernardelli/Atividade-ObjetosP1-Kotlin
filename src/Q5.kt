// Questão 5
class ContaBancaria(var numeroConta: String, var _nomeTitular: String, saldo: Double) {
        var nomeTitular: String = _nomeTitular
            get() {
                return field.uppercase() // Getter personalizado que retorna o nome do titular em letras maiúsulacs
            }

        var saldo: Double = saldo
            set(value) {
                if (value >= 0) {
                    field = value
                } else {
                    field = 0.0
                }
            }
    }




    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão

    // Implemente override do setter para o atributo saldo conforme especificado na quest

fun main() {

    val conta = ContaBancaria("123456", "caio", 1000.0)
    println("Saldo: ${conta.saldo}")
    println("Nome do Titular: ${conta.nomeTitular}")
    // Alterando o nome do titular para uma string com letra minúscula
    conta.nomeTitular = "vini" // fiz um get onde o nome do titular fica maiusculo

    // Alterando o saldo para um valor negativo
    conta.saldo = -500.0

    // Imprimindo os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente
    println("Número da Conta: ${conta.numeroConta}")
    println("Nome do Titular: ${conta.nomeTitular}")
    println("Saldo: ${conta.saldo}")

    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
}
