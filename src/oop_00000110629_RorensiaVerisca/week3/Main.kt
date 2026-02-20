package oop_00000110629_RorensiaVerisca.week3

fun main (){
    val e = Employee("Jeonghan")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    val w = Weapon("Excalibur")

    println("\n---- Test Weapon ----")

    w.damage = -50
    println("Damage sekarang: ${w.damage}")
    println("Tier senjata: ${w.tier}")

    w.damage = 9999
    println("Damage sekarang: ${w.damage}")
    println("Tier senjata: ${w.tier}")
}