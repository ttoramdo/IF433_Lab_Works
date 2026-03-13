package oop_00000110629_RorensiaVerisca.week6

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout..")
    method.pay(amount)
}

fun main() {

    val lamp = SmartLamp("1", "Ruang Tamu")
    val speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== SECURITY MODE AKTIF ===")
    hub.activateSecurityMode()

    println()
    println("=== MATIKAN SEMUA PERANGKAT ===")
    hub.turnOffAllSwitches()
}