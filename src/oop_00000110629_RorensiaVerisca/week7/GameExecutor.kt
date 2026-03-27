package oop_00000110629_RorensiaVerisca.week7

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}! Bersiaplah bertarung!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Loot didapat: $name (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di Safe Zone. Aman untuk sekarang.")
        }
    }
}