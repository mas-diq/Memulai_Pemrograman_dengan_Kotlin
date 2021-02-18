// main function
fun main() {
    printResult(10){ value ->
        value + value
    }

    cetakNama("Shiddiq"){it ->
        "ini adalah pesan dari " + it
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun cetakNama(nama: String, cetak:(String) -> String){
    val hasil = cetak(nama)
    println(hasil)
}