// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    val nilai = 1.rangeTo(100) step 9

    nilai.forEachIndexed { x, y ->
        println("Index ke - $x nilainya adalah $y")
    }
}