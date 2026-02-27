package oop_00000110629_RorensiaVerisca.week4

class ElectricCar (brand: String, numberOfDoors: Int, private val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}