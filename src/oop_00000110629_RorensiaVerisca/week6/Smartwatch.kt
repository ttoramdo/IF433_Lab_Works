package oop_00000110629_RorensiaVerisca.week6

class Smartwatch: Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}

