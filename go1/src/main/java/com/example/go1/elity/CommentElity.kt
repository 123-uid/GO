package com.example.go1.elity

data class CommentElity(
    val code: Int,
    val `data`: List<CommentData>,
    val message: String
)

data class CommentData(
    val childcount: Int,
    val createtime: String,
    val icon: String,
    val id: Int,
    val msg: String,
    val parentid: Int,
    val rootid: Int,
    val tousername: Any,
    val type: Int,
    val username: String
)