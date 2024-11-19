package com.example.go1.dh

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.go1.R
import com.example.go1.adaptert.BannerAdaptert
import com.example.go1.adaptert.GoodesAdaptert
import com.example.go1.base.BaseMVVMFraent
import com.example.go1.databinding.FragmentHOMEBinding
import com.example.go1.elity.BannerData
import com.example.go1.elity.GaoodesData
import com.example.go1.goodes.DetailActivity
import com.example.go1.goodes.GoodesViewModel
import com.example.go1.goodes.SearchActivity
import com.youth.banner.loader.ImageLoader


class HOMEFragment : BaseMVVMFraent<FragmentHOMEBinding,GoodesViewModel>() {

    val list= mutableListOf<String>()

    lateinit var goodesAdaptert: GoodesAdaptert


    override fun getLyout(): Int =R.layout.fragment_h_o_m_e

    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java

    override fun initView() {
          mode.banner()
          mode.goodes()
          goodesAdaptert= GoodesAdaptert()
          vie.rv.layoutManager= GridLayoutManager(context,2)
          vie.rv.adapter=goodesAdaptert
          goodesAdaptert.setOnItemClickListener { adapter, view, position ->

              val intent = Intent(context, DetailActivity::class.java)
              intent.putExtra("id",goodesAdaptert.data[position])
              startActivity(intent)
          }
        vie.etSs.setOnClickListener {
            val intent = Intent(context, SearchActivity::class.java)
            startActivity(intent)
        }

    }

    override fun initData() {
          mode.bcg.observe(this){
              list.clear()
              it.data.forEach{
                  list.add(it.imagePath)
              }
              vie.br.setImages(list)
              vie.br.setImageLoader(object :ImageLoader(){
                  override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
                          Glide.with(context!!).load(path).into(imageView!!)
                      }
                  }).start()
          }

        mode.gcg.observe(this){
            if (it.code==200){
                goodesAdaptert.data.clear()
                goodesAdaptert.data.addAll(it.data)
                goodesAdaptert.notifyDataSetChanged()
            }
        }
    }

}



//              if (it.hashCode()==200){
//                   val img = mutableListOf<String>()
//                  img.clear()
//                  it.data.forEach(
//                      img.add(it)
//                  )
//                  vie.br.setImages(img)
//                  vie.br.setImageLoader(object :ImageLoader(){
//                      override fun displayImage(context: Context?, path: Any?, imageView: ImageView?) {
//                          Glide.with(context!!).load(path).into(imageView!!)
//                      }
//                  }).start()
//              }