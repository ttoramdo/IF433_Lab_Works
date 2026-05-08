package oop_00000110629_RorensiaVerisca.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).apply {

    }.also {
        homeDevices.add(it)
    }
}