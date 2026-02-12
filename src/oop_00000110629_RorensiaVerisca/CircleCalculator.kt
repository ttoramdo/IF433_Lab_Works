package oop_00000110629_RorensiaVerisca
fun main(args: Array<String>) {
    // Variable definition
    val radius = 7.0
    val pi = 3.14
    // Calculation
    val area = pi * radius * radius
// Output
    println("Radius : $radius, Area : $area")
    checkSize(area)
}
fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}

