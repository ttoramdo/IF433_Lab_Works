package oop_00000110629_RorensiaVerisca.week4

open class Car (brand: String, val numberOfDoors: Int) : Vehicle(brand)  {
    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
    override fun honk(){
        println("TINTIN! Mobil $brand lewat!")
    }
}