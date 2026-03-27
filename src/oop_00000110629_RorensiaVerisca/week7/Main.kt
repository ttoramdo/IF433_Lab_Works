package oop_00000110629_RorensiaVerisca.week7

fun main() {
    println("==== TEST SINGLETON ====")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val  reg1 = RegularUser("Jeonghan", 30)
    val  reg2 = RegularUser("Jeonghan", 30)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val  data1 = DataUser("Jeonghan", 30)
    val  data2 = DataUser("Jeonghan", 30)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 31)
    println("Hasil  Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

}