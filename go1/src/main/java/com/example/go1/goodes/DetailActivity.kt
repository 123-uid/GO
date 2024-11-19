package com.example.go1.goodes

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Html.ImageGetter
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.go1.R
import com.example.go1.adaptert.DeatailAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityDetailBinding
import com.example.go1.elity.GaoodesData
import com.example.go1.elity.GoodesElity
import com.youth.banner.loader.ImageLoader

class DetailActivity : BaseMVVMActvity<ActivityDetailBinding,GoodesViewModel>() {








    val list = mutableListOf<String>()

    override fun getLyout(): Int =R.layout.activity_detail

    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java

    override fun initView() {

          vie.fh.setOnClickListener { finish() }

        val goodes = intent.getSerializableExtra("id") as GaoodesData
        Glide.with(this).load(goodes.goods_default_icon).into(vie.im)
        Glide.with(this).load(goodes.goods_detail_one).into(vie.im1)
          Glide.with(this).load(goodes.goods_detail_two).into(vie.im2)
        vie.tvName.text=goodes.goods_desc
        vie.tvPrice.text="${goodes.goods_default_price}元"
        vie.imXq.setOnClickListener {
            Toast.makeText(this,"${goodes.goods_desc}${goodes.goods_default_price}元",Toast.LENGTH_SHORT).show()
        }
        vie.kf.setOnClickListener {
            Toast.makeText(this,"客服",Toast.LENGTH_SHORT).show()
        }
        vie.sc.setOnClickListener {
            Toast.makeText(this,"收藏",Toast.LENGTH_SHORT).show()
        }
        vie.bt1.setOnClickListener {
            Toast.makeText(this,"购买成功",Toast.LENGTH_SHORT).show()
        }
        vie.bt2.setOnClickListener {
            Toast.makeText(this,"添加购物车成功",Toast.LENGTH_SHORT).show()
        }

    }

    override fun initData() {

    }

}