package oop_00000110629_RorensiaVerisca.week14

import java.io.File
import java.io.FileWriter

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


interface PricingStrategy{
    fun calculate(price: Double): Double
}
class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}
class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}
class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        val order = Order(itemName, finalPrice, pricing::class.simpleName ?: "Unknown")
        println("Memproses pesanan ${order.itemName} seharga ${order.finalPrice}")
        repo.saveOrder(order)
        notifier.sendNotification(order)
    }
}
fun main() {
    val processor = SafeOrderProcessor(
        repo = CsvOrderRepository(),
        notifier = EmailNotifier()
    )

    processor.processOrder("Laptop", 15_000_000.0, VipPricing())
    processor.processOrder("Mouse", 200_000.0, RegularPricing())
}

//check point 1 ketinggala