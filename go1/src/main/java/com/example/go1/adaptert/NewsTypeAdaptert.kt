package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.NewsElityTypeData

class NewsTypeAdaptert :BaseQuickAdapter<NewsElityTypeData,BaseViewHolder>(R.layout.it_newsfl) {
    override fun convert(helper: BaseViewHolder, item: NewsElityTypeData) {
       helper.setText(R.id.tv_name,item.typename)
    }
}