// main function
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    val sqore = 90
    val nilai = when (sqore) {
        10 -> "Jelek"
        75 -> "Ngepas"
        90 -> "Bagus"
        else -> "Tidak termasuk nilai"
    }
    println(stringOfValue)
    println(nilai)
}