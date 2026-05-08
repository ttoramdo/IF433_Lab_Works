package oop_00000110629_RorensiaVerisca.week11

fun String.addGreeting() : String {
    return "Hello, $this"
}
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}
fun String?.isNullOrEmptyCustom() : Boolean{
    return this == null || this.isEmpty()
}