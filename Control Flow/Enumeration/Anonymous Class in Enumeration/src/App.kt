// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    colorRed.printValue()
    colorGreen.printValue()
    colorBlue.printValue()

//    val uas = Nilai.UAS
//    val uts = Nilai.UTS
//    val uu = Nilai.UU
//
//    uas.cetak()
//    uts.cetak()
//    uu.cetak()
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

//enum class Nilai(val n: Int){
//    UTS(90){
//        override fun cetak(){
//            println("Nilainya adalah $n")
//        }
//    },
//    UAS(32){
//        override fun cetak() {
//            println("Nilainya adalah $n")
//        }
//    },
//    UU(99){
//        override fun cetak() {
//            println("Nilainya adalah $n")
//        }
//    };
//    abstract fun cetak()
//}