package com.example.go1.dh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.GWCAdaptert
import com.example.go1.base.BaseFraent
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.databinding.FragmentGWCBinding
import com.example.go1.elity.DetailElity
import com.example.go1.goodes.GoodesViewModel
import com.example.go1.play.PayActivity


class GWCFragment : BaseMVVMFraent<FragmentGWCBinding,GoodesViewModel>() {

    lateinit var gwcAdaptert: GWCAdaptert

    var list = mutableListOf<DetailElity.DataDTO>()

    override fun getLyout(): Int =R.layout.fragment_g_w_c
    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java
    override fun initView() {
           mode.gwc()
          gwcAdaptert= GWCAdaptert(list)
          vie.rv.layoutManager= LinearLayoutManager(context)
          vie.rv.adapter=gwcAdaptert
          vie.zf.setOnClickListener {
              startActivity(Intent(context, PayActivity::class.java))
          }


    }

    override fun initData() {
        mode.ccg.observe(this){
            if (it.code==200){
                list.clear()
                list.addAll(listOf(it.data))
                gwcAdaptert.notifyDataSetChanged()
                vie.tvPrice.text="${it.data.goods_default_price}元"
            }
        }
    }




}






















