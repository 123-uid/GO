package com.example.go1.elity

data class ParkingElity(
    val code: Int,
    val `data`: List<ParkingData>,
    val message: String
)

data class ParkingData(
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