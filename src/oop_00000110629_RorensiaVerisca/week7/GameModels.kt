package oop_00000110629_RorensiaVerisca.week7

enum class ItemRarity(val dropChance: Int) {
    COMMON(70), UNCOMMON(10), RARE(7), EPIC(3), LEGENDARY(1)
}
data class GameItem(
    val name: String, val damage: Int, val rarity: ItemRarity
)