// Questão 4
interface FormaGeometrica {
    // Declare um método abstrato calcularArea() conforme especificado na questão

    abstract fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
        // Implemente o método calcularArea() para o Retangulo conforme especificado na questão
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
        // Implemente o método calcularArea() para o Circulo conforme especificado na questão
    }
}

fun main() {
    val retangulo1 = Retangulo(10.0,20.0)
    val areaRetangulo = retangulo1.calcularArea()
    println("Área do retângulo: $areaRetangulo")

    val circulo1 = Circulo(50.0)
    val areaCirculo = circulo1.calcularArea()
    println("Área do círculo: $areaCirculo")


    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
}
