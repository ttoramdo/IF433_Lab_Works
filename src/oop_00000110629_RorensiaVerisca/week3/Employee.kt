package oop_00000110629_RorensiaVerisca.week3

class Employee(val name: String){
    var salary: Int = 0
}

var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke: $value")
        this.salary = value
    }