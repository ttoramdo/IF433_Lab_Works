package oop_00000110629_RorensiaVerisca.week5

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}