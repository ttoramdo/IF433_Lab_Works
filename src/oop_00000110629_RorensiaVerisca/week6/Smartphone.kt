package oop_00000110629_RorensiaVerisca.week6

class Smartphone: Camera, Phone {
    override fun turnOn (){
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting")
    }
}