/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

class Cat(private var name: String) {
    // TODO 1
    var sleep: Boolean = false
    fun getName(): String {
        println("Fungsi getter dipanggil")
        return name
    }

    fun setName(newName: String) {
        println("Fungsi setter dipanggil")
        name = newName
    }

    fun toSleep() {
        if (sleep){
            setName(name)
            getName()
            println("$name, sleep!")
        } else{
            getName()
            println("$name, let's play!")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}