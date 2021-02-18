// main function
fun main() {
    10.printInt()

    99.Cetak()
}

fun Int.printInt() {
    println("value $this")
}

fun Int.Cetak(){
    var i = this;
    i++
    println("Nilai $i")
}