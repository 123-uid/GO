package com.example.go1.elity

data class NewsElityType(
    val code: Int,
    val `data`: List<NewsElityTypeData>,
    val message: String
)

data class NewsElityTypeData(
    val id: Int,
    val typename: String
)