package org.example
//Extencion de funcion para duplicar numeros
fun main() {
    val numero=5
    println(numero.duplicar())
}
fun Int.duplicar():Int {
    return this * 2
}
