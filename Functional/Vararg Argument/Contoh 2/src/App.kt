// main function
fun main() {
    sets(10, 10,90,100, name = "Kotlin")
}

fun sets(vararg number: Int, name: String): Int {
    println(name)
    println(number.sum())
    return number.sum()
}