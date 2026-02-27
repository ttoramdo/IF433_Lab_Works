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

    val manager = Manager(
        name = "Jeonghan",
        baseSalary = 15000000
    )
    val developer = Developer(
        name = "Dokyeom",
        baseSalary = 10000000,
        programmingLanguage = "Kotlin"
    )
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}