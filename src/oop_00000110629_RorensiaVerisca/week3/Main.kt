package oop_00000110629_RorensiaVerisca.week3

fun main (){
    val e = Employee("Jeonghan")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")


}