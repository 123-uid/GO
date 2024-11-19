package com.example.go1.elity

data class VisitorElity(
    val code: Int,
    val `data`: List<VisitorData>,
    val message: String
)

data class VisitorData(
    val address: String,
    val authname: String,
    val caption: String,
    val dianzan: Int,
    val guanzhu: Int,
    val headpath: String,
    val id: Int,
    val like_count: String,
    val publishtime: String,
    val type: Int,
    val videomainimg: String,
    val videopath: String,
    val view_count: String
)