package org.example
//Funcion de orden superior
fun main() {
    println(aplicarOperacion(5,::cuadrado))
}
fun aplicarOperacion(numero:Int,funcion:(Int)->Int):Int {
    return funcion(numero)
}

fun cuadrado(numero: Int):Int {
    return numero*numero
}
