package oop_00000110629_RorensiaVerisca.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        when (product) {
            is Electronic -> {
                val transactionId = JavaPaymentService.processPayment(product.id)!!
                println("${product.name} (Warranty ${product.warrantyMonths}) -> Transaction ID: $transactionId")
            }

            is Clothing -> {
                val transactionId = JavaPaymentService.processPayment(product.id)!!
                println("${product.name} (Size ${product.size}) -> Transaction ID: $transactionId")
            }
        }
    }
}