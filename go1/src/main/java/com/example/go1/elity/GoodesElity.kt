package com.example.go1.elity

import java.io.Serializable

data class GoodesElity(
    val code: Int,
    val `data`: List<GaoodesData>,
    val message: String
)

data class GaoodesData(
    val bannerList: List<String>,
    val category_id: Int,
    val goods_attribute: String,
    val goods_banner: String,
    val goods_code: String,
    val goods_default_icon: String,
    val goods_default_price: Int,
    val goods_desc: String,
    val goods_detail_one: String,
    val goods_detail_two: String,
    val goods_sales_count: Int,
    val goods_stock_count: Int,
    val id: Int
):Serializable