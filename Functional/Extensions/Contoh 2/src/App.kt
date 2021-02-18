// main function
fun main() {
    println(10.plusThree())
    println(99.tambahTiga())
}

fun Int.plusThree(): Int {
    return this + 3
}

fun Int.tambahTiga(): String{
    var i = this
    i = i+3
    return "Nilainy adalah $i"
}