package oop_00000110629_RorensiaVerisca.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)