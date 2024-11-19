package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.RepairData
import java.text.SimpleDateFormat
import java.util.Date

class RepairAdaptert :BaseQuickAdapter<RepairData,BaseViewHolder>(R.layout.it_repair) {
    override fun convert(helper: BaseViewHolder, item: RepairData) {
        var sdf=SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        var wx : Date? =sdf.parse(item.publishtime)
        var wxsj :String?=SimpleDateFormat.getDateInstance().format(wx)
        helper.setText(R.id.tv_id,"维修单号：${item.id}")
        helper.setText(R.id.tv_sj,"维修时间：${wxsj}")
        helper.setText(R.id.tv_name,"维修详情：${item.caption}")
 helper.setText(R.id.tv_name,"维修师傅：${item.authname}")

    }
}