// main function
fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }

//    val nilai: Array<Nilai> = Nilai.values()
//    nilai.forEach { Nilai-> println(Nilai) }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
//
//enum class Nilai(val n: Int){
//    UTS(90),
//    UAS(80),
//    UU(90),
//}