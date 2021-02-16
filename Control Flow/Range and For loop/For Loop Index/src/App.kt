// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    val nilai = 1.rangeTo(100) step 13

    for ((x, y) in nilai.withIndex()){
        println("nilai pada index ke - $x adalah $y")
    }
}