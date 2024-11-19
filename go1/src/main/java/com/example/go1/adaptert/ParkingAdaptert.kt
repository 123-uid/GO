package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.ParkingData
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class ParkingAdaptert :BaseQuickAdapter<ParkingData,BaseViewHolder>(R.layout.it_parking) {
    override fun convert(helper: BaseViewHolder, item: ParkingData) {
       val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
       val ks : Date? =sdf.parse(item.publishtime)
       val kssj :String?= DateFormat.getDateTimeInstance().format(ks)
       val js : Date? =sdf.parse(item.view_count.toString())
       val jssj :String?=DateFormat.getDateTimeInstance().format(js)
//       val tc : Date? =sdf.parse(item.like_count.toString())
//       val tcsj :String?=DateFormat.getDateTimeInstance().format(tc)
        helper.setText(R.id.tv_kssj,kssj)
        helper.setText(R.id.tv_jssj,jssj)
        helper.setText(R.id.tv_tcsj,"${item.like_count}天")
        helper.setText(R.id.tv_cph,item.caption)
        helper.setText(R.id.tv_name,item.authname)
    }
}