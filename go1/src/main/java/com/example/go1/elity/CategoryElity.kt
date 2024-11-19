package com.example.go1.elity

data class CategoryElity(
    val code: Int,
    val `data`: List<CategoryData>,
    val message: String
)

data class CategoryData(
    val category_icon: Any,
    val category_name: String,
    val `data`: List<CategoryDataX>,
    val id: Int,
    val parent_id: Int
)

data class CategoryDataX(
    val category_icon: String,
    val category_name: String,
    val `data`: Any,
    val id: Int,
    val parent_id: Int
)