package oop_00000110629_RorensiaVerisca.week14
import java.io.File
import java.io.FileWriter

class BadOrderProcessor {
    private val file = File("orders.csv")
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName, $finalPrice, $customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}
data class Order(val itemName: String, val finalPrice: Double, val customerType: String)

interface OrderRepository {
    fun saveOrder(order: Order)
}

class CsvOrderRepository(private val filePath: String = "orders.csv") : OrderRepository {
    override fun saveOrder(order: Order) {
        FileWriter(File(filePath), true).use { writer ->
            writer.write("${order.itemName},${order.finalPrice},${order.customerType}\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(order: Order)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(order: Order) {
        println("Email terkirim: Pesanan ${order.itemName} Anda telah dikonfirmasi!")
    }
}

class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "VIP"  -> basePrice * 0.90
            else   -> basePrice
        }
        val order = Order(itemName, finalPrice, customerType)
        println("Memproses pesanan ${order.itemName} seharga ${order.finalPrice}")
        repo.saveOrder(order)
        notifier.sendNotification(order)
    }
}