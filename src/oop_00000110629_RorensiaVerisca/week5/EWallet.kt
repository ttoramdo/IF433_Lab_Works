package oop_00000110629_RorensiaVerisca.week5

class EWallet(accName: String, var balance: Double): PaymentMethod(accName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil menggunakan Ewallet oleh $accName")
        } else {
            println("Saldonya kurang kack T_________T")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accName melakukan top up sebesar $amount")
    }
}