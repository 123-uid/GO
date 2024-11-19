package com.example.go1.elity

data class BannerElity(
    val code: Int,
    val `data`: List<BannerData>,
    val message: String
)

data class BannerData(
    val desc: String,
    val id: Int,
    val imagePath: String,
    val isVisible: Int,
    val order: Int,
    val title: String,
    val type: Int,
    val url: String
)