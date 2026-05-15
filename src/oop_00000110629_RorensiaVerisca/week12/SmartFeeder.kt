package oop_00000110629_RorensiaVerisca.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) throw DispenserJamException()
    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)

    println("Kibble berhasil dikeluarkan!!")
    return availableGram - requestedGram
}

fun main(){
    var currentKibbleStock = 50
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Peringatan: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Peringatan: ${e.message}")
    } catch (e: Exception) {
        println("Terjadi kesalahan umum.")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n==== Mengisi ulang stok ====")
    val feedingResult = runCatching {
        dispenseKibble(30, 1000, false)
    }
}