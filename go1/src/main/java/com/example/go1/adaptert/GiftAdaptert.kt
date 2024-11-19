package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.GiftData

class GiftAdaptert:BaseQuickAdapter<GiftData,BaseViewHolder>(R.layout.it_lw) {
    override fun convert(helper: BaseViewHolder, item: GiftData) {
            helper.setText(R.id.tv_name,item.giftname)
            helper.setText(R.id.tv_price,"${item.price}元")
            Glide.with(context).load(item.giftpath).into(helper.getView(R.id.im))
    }
}