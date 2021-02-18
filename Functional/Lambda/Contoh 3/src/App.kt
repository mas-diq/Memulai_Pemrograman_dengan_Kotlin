// main function
fun main() {
    printResult(10 ,sum)
    cetakPertambahan(10,tambahDua)
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

fun cetakPertambahan(nilai: Int, tambahDua: (Int) -> Int){
    val hasil = tambahDua(nilai)
    println(hasil)
}

var tambahDua: (Int) -> Int = { nilai -> nilai +2}