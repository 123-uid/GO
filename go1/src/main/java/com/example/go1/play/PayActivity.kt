package com.example.go1.play

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.go1.R
import com.example.go1.adaptert.DeatailAdaptert
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityPayBinding
import com.example.go1.elity.DetailElity
import com.example.go1.goodes.GoodesViewModel

class PayActivity : BaseMVVMActvity<ActivityPayBinding,GoodesViewModel>() {


    lateinit var deatailAdaptert: DeatailAdaptert
    val list= mutableListOf<DetailElity.DataDTO>()

    override fun getLyout(): Int =R.layout.activity_pay

    override fun getBaset(): Class<GoodesViewModel> = GoodesViewModel::class.java

    override fun initView() {
        mode.xq()
        deatailAdaptert = DeatailAdaptert(list)
        vie.rv.layoutManager= LinearLayoutManager(this)
        vie.rv.adapter=deatailAdaptert
        vie.bt1.setOnClickListener {
                Toast.makeText(this,"支付成功",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,PayCGActivity::class.java))
            }
        vie.bt2.setOnClickListener {
            Toast.makeText(this,"支付失败",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,PaySBActivity::class.java))
        }

        vie.fh.setOnClickListener {
            finish()
        }

    }

    override fun initData() {
          mode.xcg
              .observe(this){
                  if (it.code==200){
                      list.clear()
                      list.addAll(listOf(it.data))
                      deatailAdaptert.notifyDataSetChanged()
                      vie.tvPrice.text="${it.data.goods_default_price}元"
                  }
              }
    }

}