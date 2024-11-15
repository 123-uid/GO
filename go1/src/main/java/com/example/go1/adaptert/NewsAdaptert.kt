package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.NewsData

class NewsAdaptert :BaseQuickAdapter<NewsData,BaseViewHolder>(R.layout.it_news) {
    override fun convert(helper: BaseViewHolder, item: NewsData) {
        helper.setText(R.id.tv_id,"id为:${item.id}")
        helper.setText(R.id.tv_bt,"新闻标题:${item.sourcesitename}")
        helper.setText(R.id.tv_nr,"新闻详情描述内容:${item.title}")
    }
}