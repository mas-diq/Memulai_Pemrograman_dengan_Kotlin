// main function
fun main() {
    val rangeInt = 1..10 step 2

    rangeInt.forEach {
        print("$it ")
    }

    println(rangeInt.step)

    val nilai = 1..100 step 8

    nilai.forEach{
        println("Nilainya adalah $it")
    }

    println(nilai.step)

}