package oop_00000110629_RorensiaVerisca.week9

fun main() {
    val fruits = listOf("Apple", "Banana", "Orange")
    println(fruits)

    val mutableFruits = mutableListOf("Apple", "Banana")
    mutableFruits.add("Mango")
    mutableFruits.remove("Apple")

    println(mutableFruits)
}