package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.VisitorData
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class VisitorAdaptert :BaseQuickAdapter<VisitorData,BaseViewHolder>(R.layout.it_visitor) {
    override fun convert(helper: BaseViewHolder, item: VisitorData) {
          val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
       val ks : Date? =sdf.parse(item.publishtime)
       val kssj :String?= DateFormat.getDateTimeInstance().format(ks)
       val js : Date? =sdf.parse(item.view_count)
       val jssj :String?=DateFormat.getDateTimeInstance().format(js)
       val qd : Date? =sdf.parse(item.like_count)
        val qdsj :String?=DateFormat.getDateTimeInstance().format(qd)
           helper.setText(R.id.tv_kssj,kssj)
           helper.setText(R.id.tv_jssj,jssj)
           helper.setText(R.id.tv_tcsj,qdsj)
        helper.setText(R.id.tv_cph,item.caption)
        helper.setText(R.id.tv_name,item.authname)
    }
}