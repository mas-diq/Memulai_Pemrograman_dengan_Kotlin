// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEach { value ->
        println("value is $value!")
    }

    val nilai = 1.rangeTo(100) step 23

    nilai.forEach { x ->
        println("cetak $x")
    }
}