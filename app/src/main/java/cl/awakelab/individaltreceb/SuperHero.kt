package cl.awakelab.individaltreceb

data class SuperHero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    var photo: String
)

fun main() {
    guardarHero()
}

fun guardarHero() {

    var cant: Int = 1
    val heroes = mutableListOf<SuperHero>()
    while (cant == 1) {
        println("Ingrese nombre Superheroe")
        val nombre = readln()
        println("Ingrese  publisher")
        val publisher = readln()
        println("Ingrese  realName")
        val realName = readln()
        println("Ingrese  photo")
        val photo = readln()

        heroes.add(SuperHero(nombre, publisher, realName, photo))

        cant = readln().toInt()

    }
    for (h in heroes)
        println(h)

}
