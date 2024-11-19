package com.example.go1.elity

data class DepartmentElity(
    val code: Int,
    val `data`: List<DepartmentData>,
    val message: String
)

data class DepartmentData(
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