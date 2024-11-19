package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.PatrolesData
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class PatrolesAdapter :BaseQuickAdapter<PatrolesData,BaseViewHolder>(R.layout.it_patrples){
    override fun convert(helper: BaseViewHolder, item: PatrolesData) {

        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val ks : Date? =sdf.parse(item.createtime)
        val kssj :String?=DateFormat.getDateTimeInstance().format(ks)
        val js : Date? =sdf.parse(item.createtime)
        val jssj :String?=DateFormat.getDateTimeInstance().format(js)
        val xg : Date? =sdf.parse(item.createtime)
        val xgsj :String?=DateFormat.getDateTimeInstance().format(xg)

           helper.setText(R.id.tv_kssj,kssj)
           helper.setText(R.id.tv_jssj,jssj)
           helper.setText(R.id.tv_xgsj,xgsj)
           helper.setText(R.id.tv_xgd,item.username)
    }
}