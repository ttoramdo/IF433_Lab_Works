package oop_00000110629_RorensiaVerisca.week10

class MathBoxx<T : Number> (val value1: T, val value2: T){
    fun sum() : Double{
        return value1.toDouble() + value2.toDouble()
    }
    fun <T> getMax(a: T, b: T): T where T : Comparable<T>{
        return if (a > b) a else b
    }
}