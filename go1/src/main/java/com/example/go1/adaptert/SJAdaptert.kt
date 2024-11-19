package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.GaoodesData
import com.example.go1.elity.GoodesElity

class SJAdaptert :BaseQuickAdapter<GaoodesData,BaseViewHolder>(R.layout.it_sj) {
    override fun convert(helper: BaseViewHolder, item: GaoodesData) {
          helper.setText(R.id.tv_name,item.goods_desc)
          helper.setText(R.id.tv_price,"￥${item.goods_default_price}元")
          Glide.with(context).load(item.goods_default_icon).into(helper.getView(R.id.im))
    }
}