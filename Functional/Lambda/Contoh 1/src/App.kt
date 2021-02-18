// main function
fun main() {
    printMessage("Hello From Lambda")
    println(cetakPesan("Selamat belajar kotlin"))
}

val printMessage = { message: String -> println(message) }
val cetakPesan = {pesan: String -> "ini adalah sebuah pesan, yang isinya adalah $pesan"}