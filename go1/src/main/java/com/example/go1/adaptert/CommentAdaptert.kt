package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.CommentData

class CommentAdaptert:BaseQuickAdapter<CommentData,BaseViewHolder>(R.layout.it_pl) {
    override fun convert(helper: BaseViewHolder, item: CommentData) {
             helper.setText(R.id.tv_name,item.username)
             helper.setText(R.id.tv_title,item.msg)
             Glide.with(context).load(item.icon).into(helper.getView(R.id.im))
    }
}