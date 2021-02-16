// main function
fun main() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }

    println(if (11 !in tenToOne) "Bukan termasuk" else "Termasuk")
}