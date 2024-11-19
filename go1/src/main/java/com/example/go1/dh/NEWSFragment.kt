package com.example.go1.dh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.NewsTayAdaptert
import com.example.go1.adaptert.NewsTypeAdaptert
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.base.BaseRepo
import com.example.go1.databinding.FragmentNEWSBinding
import com.example.go1.elity.NewsElityTay
import com.example.go1.newstay.NewsTayMutActivity
import com.example.go1.newstay.NewsTayViewModel


class NEWSFragment : BaseMVVMFraent<FragmentNEWSBinding,NewsTayViewModel>() {

    lateinit var newsTayAdaptert: NewsTayAdaptert
    val list = mutableListOf<NewsElityTay.DataDTO.RecordsDTO>()



    lateinit var newsTypeAdaptert: NewsTypeAdaptert


    override fun getLyout(): Int =R.layout.fragment_n_e_w_s

    override fun getBaset(): Class<NewsTayViewModel> = NewsTayViewModel::class.java

    override fun initView() {
        mode.xw()
        mode.flxw()

        newsTypeAdaptert = NewsTypeAdaptert()
        vie.fl.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        vie.fl.adapter = newsTypeAdaptert

        newsTayAdaptert = NewsTayAdaptert(list)
        vie.rv.layoutManager = LinearLayoutManager(context)
        vie.rv.adapter = newsTayAdaptert
        newsTayAdaptert.setOnItemClickListener { adapter, view, position ->
            val intent =Intent(this.context,NewsTayMutActivity::class.java)
            intent.putExtra("id",newsTayAdaptert.data[position])
            startActivity(intent)
        }
    }

    override fun initData() {
        mode.fcg.observe(this){
            if (it.code==200){
                newsTypeAdaptert.data.clear()
                newsTypeAdaptert.data.addAll(it.data)
                newsTypeAdaptert.notifyDataSetChanged()
            }
        }

        mode.cg.observe(this){
            if (it.code==0){
                list.clear()
                list.addAll(it.data.records)
                newsTayAdaptert.notifyDataSetChanged()
            }
        }
    }

}