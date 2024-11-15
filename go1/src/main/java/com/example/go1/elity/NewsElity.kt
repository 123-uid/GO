package com.example.go1.elity

data class NewsElity(
    val code: Int,
    val `data`: List<NewsData>,
    val message: String
)

data class NewsData(
    val auth: String,
    val description: String,
    val id: Int,
    val istop: String,
    val mainimgurl: String,
    val newstypeid: Int,
    val sourcesiteid: Int,
    val sourcesitename: String,
    val sourceurl: String,
    val title: String
)