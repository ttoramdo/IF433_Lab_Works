package oop_00000110629_RorensiaVerisca.week4

fun main() {
    println ("===== Testing Vehicle ====")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n===== Testing Car =====")
    val myCar = Car("Toyota", numberOfDoors =4 )
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n===== Testing Electric Car =====")
    val myElectricCar = ElectricCar("BYD", numberOfDoors =4, batteryCapacity = 90  )
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()
}