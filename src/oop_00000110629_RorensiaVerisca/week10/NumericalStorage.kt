package oop_00000110629_RorensiaVerisca.week10

class MathBoxx<T : Number> (val value1: T, val value2: T){
    fun sum() : Double{
        return value1.toDouble() + value2.toDouble()
    }
}