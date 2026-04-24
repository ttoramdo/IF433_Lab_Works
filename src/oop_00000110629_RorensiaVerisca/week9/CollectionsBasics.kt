package oop_00000110629_RorensiaVerisca.week9

fun main() {
    val fruits = listOf("Apple", "Banana", "Orange")
    println(fruits)

    val mutableFruits = mutableListOf("Apple", "Banana")
    mutableFruits.add("Mango")
    mutableFruits.remove("Apple")

    println(mutableFruits)

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA")
    println("Active Users: $activeUsers")
}