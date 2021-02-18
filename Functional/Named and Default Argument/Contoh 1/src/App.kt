// main function
fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    println(fullName)
    val shortName = getFullName(middle = "Halo", last = "Dia", first = "Mantap")
    println(shortName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}