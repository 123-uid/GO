package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.BannerData

class BannerAdaptert :BaseQuickAdapter<BannerData,BaseViewHolder>(R.layout.it_banner) {
    override fun convert(helper: BaseViewHolder, item: BannerData) {
         Glide.with(context).load(item.imagePath).into(helper.getView(R.id.im))
    }
}