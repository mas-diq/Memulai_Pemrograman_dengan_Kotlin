// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

//    val nilaiUAS = Nilai.UAS
//    val nilaiUTS = Nilai.UTS
//    val nilaiUU = Nilai.UU
//
//    println(nilaiUAS)
//    println(nilaiUTS)
//    println(nilaiUU)
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//enum class Nilai(val vue: Int){
//    UAS(90),
//    UTS(20),
//    UU(120)
//}