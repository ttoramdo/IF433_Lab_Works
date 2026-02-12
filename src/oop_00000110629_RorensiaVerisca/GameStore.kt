package oop_00000110629_RorensiaVerisca

fun main() {
    val gameTitle = "Puzzle Seventeen"
    val price = 1700000
    println("Game:  $gameTitle\nPrice: $price")
}
fun calculateDiscount (price:Int) =
    if (price > 500000)
            (price * 80) /100 else  (price * 90) / 100

