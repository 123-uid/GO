package com.example.go1.dh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.RJAdaptert
import com.example.go1.adaptert.SJAdaptert
import com.example.go1.adaptert.YJAdaptert
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.databinding.FragmentFLBinding
import com.example.go1.goodes.DetailActivity
import com.example.go1.goodes.GoodesViewModel
import com.uuzuche.lib_zxing.decoding.Intents

class FLFragment : BaseMVVMFraent<FragmentFLBinding,GoodesViewModel>() {

    lateinit var yjAdaptert: YJAdaptert

    lateinit var rjAdaptert: RJAdaptert

    lateinit var sjAdaptert: SJAdaptert

    override fun getLyout(): Int =R.layout.fragment_f_l

    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java

    override fun initView() {
         mode.yj()
         mode.rj()
         mode.sj()

        yjAdaptert = YJAdaptert()
        vie.yj.layoutManager= LinearLayoutManager(context)
        vie.yj.adapter=yjAdaptert

        rjAdaptert = RJAdaptert()
        vie.rj.layoutManager= GridLayoutManager(context,4)
        vie.rj.adapter=rjAdaptert

        sjAdaptert = SJAdaptert()
        vie.sj.layoutManager= GridLayoutManager(context,2)
        vie.sj.adapter=sjAdaptert
        sjAdaptert.setOnItemClickListener { adapter, view, position ->
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("id", sjAdaptert.data[position])
            startActivity(intent)
        }
    }

    override fun initData() {
         mode.ycg.observe(this){
             if (it.code==200){
                 yjAdaptert.data.clear()
                 yjAdaptert.data.addAll(it.data)
                 yjAdaptert.notifyDataSetChanged()
             }
         }
        mode.rcg.observe(this){
            if (it.code==200){
                rjAdaptert.data.clear()
                rjAdaptert.data.addAll(it.data)
                rjAdaptert.notifyDataSetChanged()
            }
        }
        mode.jcg.observe(this){
            if (it.code==200){
                sjAdaptert.data.clear()
                sjAdaptert.data.addAll(it.data)
                sjAdaptert.notifyDataSetChanged()
            }
        }
    }

}