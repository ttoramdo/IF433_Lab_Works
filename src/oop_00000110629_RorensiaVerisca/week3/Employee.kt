package oop_00000110629_RorensiaVerisca.week3

class Employee(val name: String){
    var salary: Int = 0
}

var salary: Int = 0
    set(value) {
        if(value < 0){
            println("ERROR: Gaji tidak boleh negatif! Di set ke 0.")
        } else {
            field = value
        }
    }