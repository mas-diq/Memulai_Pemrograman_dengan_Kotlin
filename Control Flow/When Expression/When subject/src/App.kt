import kotlin.random.Random

// main function
fun main() {
    val regis = getRegisterNumber()
    val registerNumber = when(regis){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(regis)
    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)