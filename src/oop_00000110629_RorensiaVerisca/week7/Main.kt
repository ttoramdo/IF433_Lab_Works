package oop_00000110629_RorensiaVerisca.week7

fun main() {
    println("==== TEST SINGLETON ====")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val  reg1 = RegularUSer("Jeonghan", 30)
    val  reg2 = RegularUSer("Jeonghan", 30)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val  data1 = RegularUSer("Jeonghan", 30)
    val  data2 = RegularUSer("Jeonghan", 30)
    println(data1)
    println("Sama? ${data1 == data2}")
}