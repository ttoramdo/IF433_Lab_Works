package oop_00000110629_RorensiaVerisca.week6

interface Clickable {
    val name: String
    fun click ()
}

class Button(override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik")
    }
}