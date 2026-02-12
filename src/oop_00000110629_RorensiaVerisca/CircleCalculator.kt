package oop_00000110629_RorensiaVerisca

fun main() {
    val radius = 2.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius : $radius, Area : $area")
    println(checkSize(area))
}
fun checkSize(area: Double) {
    if (area > 100){
        println("This a Big Circle")
    }else {
        println("This a Small Circle")
    }
}

