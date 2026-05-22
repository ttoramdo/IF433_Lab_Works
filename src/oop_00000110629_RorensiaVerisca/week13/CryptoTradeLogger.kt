package oop_00000110629_RorensiaVerisca.week13
import java.io.File
import java.io.FileNotFoundException
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")

    if (parts.size != 5) return null

    val id = parts[0].toIntOrNull() ?: return null
    val symbol = parts[1]
    val type = parts[2]
    val margin = parts[3].toDoubleOrNull() ?: return null
    val pnl = parts[4].toDoubleOrNull() ?: return null

    return TradeRecord(id, symbol, type, margin, pnl)
}