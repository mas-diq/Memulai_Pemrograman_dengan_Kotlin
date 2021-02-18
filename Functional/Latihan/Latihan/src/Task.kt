import kotlin.collections.mapOf as mapOf1

/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val kotlin = "Kotlin".getFirstAndLast()
    val dicoding = "Dicoding".getFirstAndLast()

    val kotlinFirstChar = kotlin["first"]
    val kotlinLastChar = kotlin["last"]

    val dicodingFirstChar = dicoding["first"]
    val dicodingLastChar = dicoding["last"]

    println("First char Kotlin is $kotlinFirstChar and $kotlinLastChar for second letter")
    println("First char Dicoding is $dicodingFirstChar and $dicodingLastChar for second letter")

}

// TODO\
fun String.getFirstAndLast(): Map<String, Char> {
    return mapOf1("first" to first(), "last" to last())
}