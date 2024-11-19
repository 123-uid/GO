package com.example.go1.elity

data class GiftElity(
    val code: Int,
    val `data`: List<GiftData>,
    val message: String
)

data class GiftData(
    val giftname: String,
    val giftpath: String,
    val id: Int,
    val price: Int
)