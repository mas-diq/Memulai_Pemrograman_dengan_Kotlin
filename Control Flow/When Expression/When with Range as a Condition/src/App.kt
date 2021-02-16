// main function
fun main() {
    val value =  27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    val nilaiBagus = 90..100
    val nilaiStandar = 75..90
    val nilaiJelek = 0..75

    val nilaiBudi = -1
    when(nilaiBudi){
        in nilaiBagus -> println("nilainya bagus")
        in nilaiStandar -> println("nilaninya standar")
        in nilaiJelek -> println("nilainya jelek")
        else -> println("bukan termasuk nilai")
    }
}