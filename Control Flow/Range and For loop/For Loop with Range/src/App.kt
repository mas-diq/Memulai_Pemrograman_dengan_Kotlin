// main function
fun main() {
    val ranges = 1.rangeTo(5)

    for (i in ranges){
        println("value is $i!")
    }

    val nilai = 1.rangeTo(100) step 15

    for (x in nilai){
        println("Nilai = $x")
    }
}