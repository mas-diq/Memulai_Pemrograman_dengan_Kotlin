typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

typealias cetakNilai = (Int, Int, String) -> String

val UTS: cetakNilai = { nilaiA, nilaiB, status -> "$status : $nilaiA dan $nilaiB"}

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    val contoh = UTS.invoke(90,89,"Lulus UTS dengan nilai")

    println(contoh)
    println(sumResult)
    println(multiplyResult)
}