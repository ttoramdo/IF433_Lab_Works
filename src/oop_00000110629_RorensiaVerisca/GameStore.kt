package oop_00000110629_RorensiaVerisca

fun main() {
    val gameTitle = "Puzzle Seventeen"
    val price = 1700000
    val finalPrice = calculateDiscount(price)
    val userNote: String? = null
    printReceipt(gameTitle=gameTitle, finalPrice=finalPrice, price=price, userNote=userNote)

}
fun calculateDiscount (price:Int ) =
    if (price > 500000)
            (price * 80) /100 else  (price * 90) / 100

fun printReceipt (gameTitle: String, finalPrice: Int, price: Int, userNote: String?) {
    println("=========RECEIPT=========\nGame: $gameTitle\nNormal Price: $price\nPrice After Disc: $finalPrice\nNote  : ${userNote ?: "Tidak ada catatan"}\n=========================" )
}
