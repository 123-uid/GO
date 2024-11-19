package com.example.go1.visitor

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.go1.R
import com.example.go1.base.BaseActvity
import com.example.go1.base.BaseMVVMActvity
import com.example.go1.databinding.ActivityVisitorAddactivityBinding

class VisitorADDActivity : BaseActvity<ActivityVisitorAddactivityBinding>() {



    override fun getLyout(): Int =R.layout.activity_visitor_addactivity

    override fun initView() {
          vie.fh.setOnClickListener { finish() }
          vie.bt.setOnClickListener {
              Toast.makeText(this,"保存成功",Toast.LENGTH_SHORT).show()
              finish()
          }
    }

    override fun initData() {

    }

}
/*
* 1.添加访客
* 2.添加访客记录
* 3.添加访客记录图片
* 4.添加访客记录视频
* */
