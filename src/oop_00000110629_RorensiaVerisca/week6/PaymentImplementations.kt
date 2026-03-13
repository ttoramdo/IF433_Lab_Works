package oop_00000110629_RorensiaVerisca.week6

class Gopay:PaymentMethod{
    override fun pay(amount: Double) {
        println("Processing RP$amount via Gopay Server")
    }
}

class CreditCard:PaymentMethod{
    override fun pay(amount: Double) {
        println("Contacting Bank For Rp$amount")
    }
}