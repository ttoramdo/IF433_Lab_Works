package oop_00000110629_RorensiaVerisca.week3

fun main (){
    val e = Employee("Jeonghan")
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")

    val w = Weapon("Excalibur")

    println("\n====  Toko Senjata ====\n")

    w.damage = -50
    println("Damage sekarang: ${w.damage}")
    println("Tier senjata: ${w.tier}")

    w.damage = 9999
    println("Damage sekarang: ${w.damage}")
    println("Tier senjata: ${w.tier}")

    println("\n==== Sistem Leveling ====\n")

    val p = Player("Jeonghan")

    println("Username: ${p.username}")
    println("Level awal: ${p.level}")

    println("\nTambah 50 XP")
    p.addXp(50)
    println("Level sekarang: ${p.level}")

    println("\nTambah 60 XP")
    p.addXp(60)   // harus naik level
    println("Level sekarang: ${p.level}")
}
