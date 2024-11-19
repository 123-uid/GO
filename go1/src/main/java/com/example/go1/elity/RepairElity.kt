package com.example.go1.elity

data class RepairElity(
    val code: Int,
    val `data`: List<RepairData>,
    val message: String
)

data class RepairData(
    val address: String,
    val authname: String,
    val caption: String,
    val dianzan: Int,
    val guanzhu: Int,
    val headpath: String,
    val id: Int,
    val like_count: Int,
    val publishtime: String,
    val type: Int,
    val videomainimg: String,
    val videopath: String,
    val view_count: Int
)