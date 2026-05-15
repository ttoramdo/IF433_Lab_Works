package oop_00000110629_RorensiaVerisca.week12

fun main(){
    println("==== TEST RUNCATCHING ====")
    val eresult: Result<Int> = runCatching{
        "42X".toInt()
    }
}