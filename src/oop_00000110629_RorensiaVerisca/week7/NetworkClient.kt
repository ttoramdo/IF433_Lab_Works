package oop_00000110629_RorensiaVerisca.week7

class NetworkClient private constructor(val url : String) {
    fun connect(){
        println("Connecting to $url...")
    }
}