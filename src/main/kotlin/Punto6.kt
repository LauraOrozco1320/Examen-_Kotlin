package org.example
//Perfil de internet
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referencia: Person?) {
    fun showProfile() {
//Completa le codigo
        println("Name:$name")
        println("Age:$age")
        if (hobby != null) {
            println("Likes to $hobby. ")
        }
        if (referencia != null) {
            println("Has a referrer named ${referencia.name}")
            if (referencia.hobby != null) {
                println(", who likes to ${referencia.hobby}.")
            } else {
                print("Doesn't have a referrer.")
            }
        }
    }
}
