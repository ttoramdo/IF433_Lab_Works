package oop_00000110629_RorensiaVerisca.week9

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println("Original Data: $numbers")
    println("\n=== HOF: FILTER ===")
    val evens = numbers.filter { it % 2 == 0 }
}