package org.example
//Funcion para sumar numeros pares
fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println(sumarPares(numeros))
}
fun sumarPares(numeros: Array<Int>): Int {
    var sumarPares = 0
    for (numeros in numeros) {
        if (numeros % 2==0) {
            sumarPares += numeros
        }
    }
    return sumarPares
}

