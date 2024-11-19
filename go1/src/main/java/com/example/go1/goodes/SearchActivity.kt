package com.example.go1.goodes

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.SSAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivitySearchBinding

class SearchActivity : BaseMVVMActvity<ActivitySearchBinding,GoodesViewModel>() {

    lateinit var ssAdaptert: SSAdaptert

    override fun getLyout(): Int =R.layout.activity_search

    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java

    override fun initView() {
        ssAdaptert= SSAdaptert()
         vie.bt.setOnClickListener {
             mode.ss()
             vie.rv.layoutManager= LinearLayoutManager(this)
             vie.rv.adapter=ssAdaptert
         }
        ssAdaptert.setOnItemClickListener { adapter, view, position ->
              val intent = Intent(this, DetailActivity::class.java)
              intent.putExtra("id",ssAdaptert.data[position])
              startActivity(intent)
        }
        vie.fh.setOnClickListener {
            finish()
        }

    }

    override fun initData() {
         mode.scg.observe(this){
             if (it.code==200){
                 ssAdaptert.data.clear()
                 ssAdaptert.data.addAll(it.data)
                 ssAdaptert.notifyDataSetChanged()
             }
         }
    }

}