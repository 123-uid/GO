package com.example.go1.adaptert


import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.DetailElity


class DeatailAdaptert (list: MutableList<DetailElity.DataDTO>) :BaseQuickAdapter<DetailElity.DataDTO,BaseViewHolder>(R.layout.it_xq,list) {
    override fun convert(helper: BaseViewHolder, item: DetailElity.DataDTO) {
           helper.setText(R.id.tv_name,item.goods_desc)
          helper.setText(R.id.tv_price,"￥${item.goods_default_price}元")
    }

}