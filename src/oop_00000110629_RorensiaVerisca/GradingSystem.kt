package oop_00000110629_RorensiaVerisca

fun main() {
    val name: String = "Seventeen"
    val score: Int = 80

    println("Nama: $name , Nilai: $score")

    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade Kamu: $grade")
}

