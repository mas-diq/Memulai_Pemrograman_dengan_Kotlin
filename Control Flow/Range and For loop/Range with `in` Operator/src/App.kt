// main function
fun main() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    val turun = 9..1
    if (10 in turun){
        println("Termasuk")
    }else{
        println("tidak termasuk")
    }

    println(if (10 in turun) "Termasuk" else "Tidak termasuk")
}