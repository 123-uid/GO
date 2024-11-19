package com.example.go1.adaptert

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.go1.R
import com.example.go1.elity.CategoryData
import com.example.go1.elity.CategoryElity

class YJAdaptert :BaseQuickAdapter<CategoryData,BaseViewHolder>(R.layout.it_yj) {
    override fun convert(helper: BaseViewHolder, item: CategoryData) {
          helper.setText(R.id.tv_name,item.category_name)
    }
}