package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.DepartmentData

class DepartmentAdaptert :BaseQuickAdapter<DepartmentData,BaseViewHolder>(R.layout.it_department) {
    override fun convert(helper: BaseViewHolder, item: DepartmentData) {
        helper.setText(R.id.tv_name,"部门编号:${item.id}")
         helper.setText(R.id.tv_id,"部门名:${item.sourcesitename}")
    }
}