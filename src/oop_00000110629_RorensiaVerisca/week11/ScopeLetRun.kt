package oop_00000110629_RorensiaVerisca.week11
fun main (){
    println("=== TEST LET FUNCTION ===")
    val name: String? = "ALexander"

    val length = name?.let{
        println("Nama terdeteksi : $it")
        it.length
    }
    println("Panjang Nama : $length")
}