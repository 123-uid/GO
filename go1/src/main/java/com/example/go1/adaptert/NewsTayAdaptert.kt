package com.example.go1.adaptert

import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.NewsElityTay

class NewsTayAdaptert (list: MutableList<NewsElityTay.DataDTO.RecordsDTO>)
    :BaseQuickAdapter<NewsElityTay.DataDTO.RecordsDTO,BaseViewHolder>(
    R.layout.it_newstay,list) {
    override fun convert(helper: BaseViewHolder, item: NewsElityTay.DataDTO.RecordsDTO) {
        helper.setText(R.id.tv_name,item.title)
        helper.setText(R.id.tv_title,item.content)
        Glide.with(context).load(item.imgurl).into(helper.getView(R.id.im))
    }
}