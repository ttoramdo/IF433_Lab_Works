package oop_00000110629_RorensiaVerisca.week4

class Manager (name: String, baseSalary: Int): Employee(name, baseSalary){
    override fun work(){
        println("\n$name sedang memimpin rapat divisi")
    }
    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}