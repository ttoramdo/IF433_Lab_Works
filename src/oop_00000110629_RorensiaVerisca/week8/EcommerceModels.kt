package oop_00000110629_RorensiaVerisca.week8

sealed class Product

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String) : Product()