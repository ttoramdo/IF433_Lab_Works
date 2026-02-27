package oop_00000110629_RorensiaVerisca.week4

fun Main() {
    println ("===== Testing Vehicle ====")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n===== Testing Car =====")
    val myCar = Car("Toyota")
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}