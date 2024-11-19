package com.example.go1.elity

data class SingEllity(
    val code: Int,
    val `data`: List<SingData>,
    val message: String
)

data class SingData(
    val childcount: Int,
    val createtime: String,
    val icon: String,
    val id: Int,
    val msg: String,
    val parentid: Int,
    val rootid: Int,
    val tousername: String,
    val type: Int,
    val username: String
)