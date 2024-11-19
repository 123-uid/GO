package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.CategoryData
import com.example.go1.elity.CategoryDataX
import com.example.go1.elity.GaoodesData
import com.example.go1.elity.GoodesElity

class RJAdaptert :BaseQuickAdapter<GaoodesData,BaseViewHolder>(R.layout.it_rj) {
    override fun convert(helper: BaseViewHolder, item: GaoodesData) {
           helper.setText(R.id.tv_name,item.goods_desc)
           Glide.with(context).load(item.goods_default_icon).into(helper.getView(R.id.im))
    }
}