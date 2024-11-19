package com.example.go1.adaptert

import android.provider.ContactsContract.Data
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R

import com.example.go1.elity.SingData
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date


class SingAdaptert:BaseQuickAdapter<SingData,BaseViewHolder>(R.layout.it_sing) {


    override fun convert(helper: BaseViewHolder, item: SingData) {
       val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
       val ks : Date? =sdf.parse(item.createtime)
       val kssj :String?=DateFormat.getDateTimeInstance().format(ks)
       val js : Date? =sdf.parse(item.createtime)
       val jssj :String?=DateFormat.getDateTimeInstance().format(js)
       val qd : Date? =sdf.parse(item.createtime)
        val qdsj :String?=DateFormat.getDateTimeInstance().format(qd)

        helper.setText(R.id.tv_kssj, kssj)
        helper.setText(R.id.tv_jssj, jssj)
        helper.setText(R.id.tv_qdsj, qdsj)
        helper.setText(R.id.tv_dz, item.username)
        helper.setText(R.id.tv_name, item.msg)
    }
}