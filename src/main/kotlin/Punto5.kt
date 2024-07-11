package org.example

//Clase abstracta y herencia
fun main(){
    val Rectangulo = Rectangulo(6.4, 4.2)
    val areaRectangulo = Rectangulo.calcularArea()
    println("El area del rectangulo es de:$areaRectangulo")

    val Circulo = Circulo(2.0)
    val areaCirculo = Circulo.calcularArea()
    println("El area del circulo es de:$areaCirculo")
}
abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
}
class Rectangulo(private val base:Double,private val altura: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }
}
class Circulo(private val radio: Double):FiguraGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI*radio*radio
    }
}

