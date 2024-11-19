package com.example.go1.elity

data class NewsElityTay(
    val code: Int,
    val `data`:  NewsElityTayData,
    val msg: String
)

data class NewsElityTayData(
    val countId: Any,
    val current: Int,
    val maxLimit: Any,
    val optimizeCountSql: Boolean,
    val orders: List<Any>,
    val pages: Int,
    val records: List<NewsElityTayRecord>,
    val searchCount: Boolean,
    val size: Int,
    val total: Int
)

data class NewsElityTayRecord(
    val content: String,
    val createTime: String,
    val flag: Int,
    val id: Int,
    val imgurl: String,
    val looks: Int,
    val ntid: Int,
    val suid: Int,
    val title: String
)